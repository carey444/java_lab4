package Models;

import java.time.LocalDate;

public class Person {
    private long id;
    private String name;
    private String gender;
    private Department department;
    private double salary;
    private LocalDate birthDate;

    public Person(long id,
                  String name,
                  String gender,
                  Department department,
                  double salary,
                  LocalDate birthDate) {

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}