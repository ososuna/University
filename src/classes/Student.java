package classes;

public class Student extends Person {
    
    private String course;

    public Student(String name, String lastName, String id, String maritalStatus, String course) {
        super(name, lastName, id, maritalStatus);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [course=" + course + "]";
    }

}
