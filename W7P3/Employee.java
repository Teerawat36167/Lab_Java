import java.util.*;

public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;
}

class Faculty extends Employee{
    private double officeHours;
    private String rank;
}

class Staff extends Employee {
    private String title;
}