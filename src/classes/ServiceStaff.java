package classes;

public class ServiceStaff extends Employee {
    
    private String section;

    public ServiceStaff(String name, String lastName, String id, String maritalStatus, int incomeYear, int officeNumber,
            String section) {
        super(name, lastName, id, maritalStatus, incomeYear, officeNumber);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "ServiceStaff [section=" + section + "]";
    }

}
