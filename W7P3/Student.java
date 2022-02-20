public class Student extends Person{
    
    private final int FRESHMEN = 1;
    private final int SOPHOMORE = 2;
    private final int JUNIOR = 3;
    private final int SENIOR = 4;

    private int status;
    
    public Student(String name,String address,String phoneNumber,String emailAddress,int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
        System.out.println("Student");
    }

    public String status() {
        if (this.status == FRESHMEN) {
            return "FRESHMEN";
        }
        else if (this.status == SOPHOMORE) {
            return "SOPHOMORE";
        }
        else if (this.status == JUNIOR) {
            return "JUNIOR";
        }
        else if (this.status == SENIOR) {
            return "SENIOR";
        }
        return "STUDENT";
    }

    public String toString() {
        return super.toString() + "Student{status=" + status() + "}" ;
    }
}