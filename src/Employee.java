import java.util.Objects;

public class Employee {
    private String name;
    private String surName;
    private String patronymic;
    private int department;
    private double salary;
    private static int counter = 1;
    private int id;
    public Employee (String name, String surName, String patronymic, int department, double salary){
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.department =department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }
    public String getName(){
        return name;
    }
    public String getSurName(){
        return surName;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public int getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public int getCounter(){
        return counter;
    }
    public int getId(){
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }

        @Override
    public String toString() {
        return "ФИО сотрудника: " + name + surName + patronymic + "; " +
                "Отдел: " + department + "; " +
                "Оклад: " + salary + " рублей; " +
                "Номер в реестре: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
