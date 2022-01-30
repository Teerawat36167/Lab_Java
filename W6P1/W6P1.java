import java.util.Scanner;

public class W6P1 {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String name = info.nextLine();
        System.out.print("Enter your age : ");
        int age = info.nextInt();
        System.out.print("Enter your weight (pound) : ");
        double weight = info.nextDouble();
        System.out.print("Enter your height (inches) : ");
        double height = info.nextDouble();

        info.close();

        BMI p1 = new BMI(name, age, weight, 0, height);
        System.out.println("BMI = "+p1.ValueBMI());
        System.out.println("Interpretation = "+p1.Interpretation());
    }
}
