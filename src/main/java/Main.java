import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import Models.Department;
import Models.Person;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Map<String, Department> departments = new HashMap<>();
        long departmentIdCounter = 1;

        InputStream in = Main.class.getClassLoader()
                .getResourceAsStream("foreign_names.csv");

        try {

            CSVParser parser = new CSVParserBuilder()
                    .withSeparator(';')
                    .build();

            CSVReader reader = new CSVReaderBuilder(
                    new InputStreamReader(in))
                    .withCSVParser(parser)
                    .build();

            reader.readNext();

            String[] line;

            while ((line = reader.readNext()) != null) {

                long id = Long.parseLong(line[0]);
                String name = line[1];
                String gender = line[2];

                LocalDate birthDate = LocalDate.parse(
                        line[3],
                        DateTimeFormatter.ofPattern("dd.MM.yyyy")
                );

                String divisionName = line[4];

                double salary = Double.parseDouble(line[5]);

                Department department = departments.get(divisionName);

                if (department == null) {
                    department = new Department(departmentIdCounter++, divisionName);
                    departments.put(divisionName, department);
                }

                Person person = new Person(
                        id,
                        name,
                        gender,
                        department,
                        salary,
                        birthDate
                );

                people.add(person);
            }

            people.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}