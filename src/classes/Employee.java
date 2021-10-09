package classes;

public class Employee extends Person {
    
    private int incomeYear;
    private int officeNumber;
    
    public Employee(String name, String lastName, String id, String maritalStatus, int incomeYear, int officeNumber) {
        super(name, lastName, id, maritalStatus);
        this.incomeYear = incomeYear;
        this.officeNumber = officeNumber;
    }

    public int getIncomeYear() {
        return incomeYear;
    }

    public void setIncomeYear(int incomeYear) {
        this.incomeYear = incomeYear;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "Employee [incomeYear=" + incomeYear + ", officeNumber=" + officeNumber + "]";
    } 

}
