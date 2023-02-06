public class Employee {
    private String fullname;
    private int department;
    private int salary;
    private int id;
    static int count;

    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        id = ++count;
    }

    public String getFullname() {
        return fullname;
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
        return "id " + id + ", ФИО: " + fullname + ", отдел: " + department + ", оклад: " + salary;
    }

}
