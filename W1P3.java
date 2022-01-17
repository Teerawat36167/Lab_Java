import java.util.Scanner;

public class W1P3 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154
        
        Scanner n=new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int number = n.nextInt();
        n.close();
        int sum=0;
        while (number>0) {
            int mod=0;
            mod=number%10;
            number/=10;
            sum+=mod;
        }
        System.out.println("The sum of the digits is "+sum);
    }
}