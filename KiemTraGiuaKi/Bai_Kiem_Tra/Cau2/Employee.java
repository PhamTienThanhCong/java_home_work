public class Employee extends Person {
    private int employeeID;
    private Double factor;
    private Double basicSalary;

    public Employee() {}

    public Employee(String name,int employeeID, Double factor, Double basicSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.factor = factor;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Double getFactor() {
        return this.factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double Salary() {
        return getFactor() * getBasicSalary();
    }

}
