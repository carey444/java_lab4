package Models;
/*
* Класс, представляющий подразделения компании
* используется для группировки сотрудников по отделам
* обладает двумя переменными id, name, конструктором
* и методом toString
 */
public class Department {
    /*
    * уникальный идентификатор подразделения
     */
    private long id;
    /*
    * название подразделения
     */
    private String name;
    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }
    /*
    * возвращает строковое представление подразделения
     */

    @Override
    public String toString() {
        return name;
    }
}
