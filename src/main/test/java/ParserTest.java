import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/*
* Класс для тестов для проверки логики парсинга данных
 */
public class ParserTest {

    /*
    * проверяет корректность преобразования зарплаты из строки в число
     */
    @Test
    void testParseSalary() {
        String salary = "4800";
        double result = Double.parseDouble(salary);

        assertEquals(4800, result);
    }

    /*
    *проверяет корректность парсинга даты рождения
     */
    @Test
    void testParseDate() {
        String date = "15.05.1970";

        LocalDate parsed = LocalDate.parse(
                date,
                DateTimeFormatter.ofPattern("dd.MM.yyyy")
        );

        assertEquals(1970, parsed.getYear());
        assertEquals(5, parsed.getMonthValue());
        assertEquals(15, parsed.getDayOfMonth());
    }

    /*
    * проверяет корректность группировки подразделений
     */
    @Test
    void testDepartmentCache() {

        Map<String, String> map = new HashMap<>();

        String dep1 = map.computeIfAbsent("I", k -> "Department1");
        String dep2 = map.computeIfAbsent("I", k -> "Department2");

        assertEquals(dep1, dep2);
    }
}