import java.util.Scanner;

public class W6P1 {
    public static void main(String[] args) {

        String name;
        int age;
        double weight,feet,inches;

        Scanner info = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        name = info.nextLine();
        BMI p1 = new BMI(name, age, weight, feet, inches);
    }
}
