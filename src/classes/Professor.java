package classes;

public class Professor extends Employee {

    private String department;

    public Professor(String name, String lastName, String id, String maritalStatus, int incomeYear, int officeNumber,
            String department) {
        super(name, lastName, id, maritalStatus, incomeYear, officeNumber);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Professor [department=" + department + "]";
    }

}
