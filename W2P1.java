import java.util.Scanner;

public class W2P1 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154
        
        Scanner num = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int today = num.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int future = num.nextInt()+today;
        num.close();
        String [] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        today %= 7;
        future %= 7;
        System.out.println("Today is "+ day[today] +" and the future day is "+ day[future]);
    }
}
