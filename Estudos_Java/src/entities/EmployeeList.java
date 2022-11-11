package entities;

public class EmployeeList {
    private int id;
    private String name;
    private double salary;

    public EmployeeList (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getsalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId (int id) {
        this.id = id;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public void increseSalary (double percentage) {
        salary += salary * percentage / 100.0;
    }
    public String toString() {
        return id + ", "
        + name + ", " +
        String.format("%.2f",salary);
    }
}

