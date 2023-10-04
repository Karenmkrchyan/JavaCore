package homework1.employee;

public class Employee {
    private String name;
    private String surname;
    private String emloyeID;
    private Double salary;
    private int position;
    private String company;

    public Employee() {
    }

    public Employee(String name, String surname, String emloyeID, Double salary, int position, String company) {
        this.name = name;
        this.surname = surname;
        this.emloyeID = emloyeID;
        this.salary = salary;
        this.position = position;
        this.company = company;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmloyeID() {
        return emloyeID;
    }

    public void setEmloyeID(String emloyeID) {
        this.emloyeID = emloyeID;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
