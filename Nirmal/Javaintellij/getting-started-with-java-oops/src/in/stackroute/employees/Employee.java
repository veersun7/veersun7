package in.stackroute.employees;

public class Employee {

    protected String empId;
    protected String name;

    public Employee() {
        System.out.println("Employee class constructor....");
    }

    public void details() {
        System.out.println("Details of an employee");
        System.out.println(name + "  " + empId);
    }

    public void setDetails(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
