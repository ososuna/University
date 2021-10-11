package classes;

public class Person {
    
    protected String name;
    protected String lastName;
    protected String id;
    protected String maritalStatus;
    
    public Person(String name, String lastName, String id, String maritalStatus) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", lastName=" + lastName + ", maritalStatus=" + maritalStatus + ", name=" + name
                + "]";
    }

}
