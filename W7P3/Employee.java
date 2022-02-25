import java.util.*;

public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name,String address,String phoneNumber,String emailAddress,String office,double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        dateHired = new Date();
        System.out.println("Employee");
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{Office=" + office + " Salary=" + salary + " DateHired=" + dateHired + "}";
    }
}

class Faculty extends Employee{
    private double officeHours;
    private String rank;

    public Faculty(String name,String address,String phoneNumber,String emailAddress,String office,double salary,double officeHours,String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
        System.out.println("Faculty");
    }

    public double getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{OfficeHours=" + officeHours + " Rank=" + rank + "}" ;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name,String address,String phoneNumber,String emailAddress,String office,double salary,String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
        System.out.println("Staff");
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + " Staff{title=" + title + "}";
    }
}