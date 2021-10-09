package classes;

public class ServiceStaff extends Person {
    
    private String section;

    public ServiceStaff(String name, String lastName, String id, String maritalStatus, String section) {
        super(name, lastName, id, maritalStatus);
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
