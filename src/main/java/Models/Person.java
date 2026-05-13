package Models;

import java.time.LocalDate;

/*
* Класс, представляющий сотрудника
* содержит основные данные о сотруднике, такие как
* id, name, gender, department, salary, birthDate
 */
public class Person {
    /*
    * уникальный идентификатор человека
     */
    private long id;
    /*
    * имя человека
     */
    private String name;
    /*
    * пол человека
     */
    private String gender;
    /*
    * подразделение, в котором он работает
     */
    private Department department;
    /*
    * зарплата человека
     */
    private double salary;
    /*
    * дата рождения
     */
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
    /*
    * возвращает строковое представление обьекта Person
     */

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