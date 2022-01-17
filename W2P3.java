import java.util.Scanner;

public class W2P3 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter year: (e.g. 2012): ");
        int year = a.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m = a.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = a.nextInt();
        a.close();
        String [] day = {"Saturday" , "Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday"};
        if (m == 1) {
            m = 13;
            year--;
        }
        else if (m == 2) {
            m = 14;
            year--;
        }
        int j = year/100;
        int k = year%100;
        int h = (q + ( (26 * (m+1) ) /10) + k + (k/4) + (j/4) + (5*j) ) % 7;
        System.out.println("Day of the week is " + day[h]);
    }
}
