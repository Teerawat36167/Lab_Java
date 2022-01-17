import java.util.Scanner;

public class W1P4 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double pounds = a.nextDouble();
        System.out.print("Enter weight in inches : ");
        double inches = a.nextDouble();
        a.close();
        double weight = pounds*0.45359237;
        double height = inches*0.0254;
        double bmi = weight/(height*height);
        System.out.println("BMI is "+bmi);
    }
}
