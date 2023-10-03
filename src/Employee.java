public class Employee {
    private String name;
    private int department;
    private int salary;
    private static int counter;
    private final int id;

    public Employee(String name, int department, int salary, int id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник : " +
                "Имя = " + name +
                ", Отдел = " + department +
                ", Зарплата = " + salary +
                ", id = " + id;
    }

}