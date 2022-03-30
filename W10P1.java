import java.util.Scanner;

public class W10P1 {
     public static void main(String[] args) {
          try {
               Scanner input = new Scanner(System.in);
               System.out.print("Enter the index of the array :");
               int a = input.nextInt();
               input.close();
               int[] x = new int[100];
               for (int i = 0; i < 100; i++) {
                    x[i] = (int) (Math.random() * 100) + 1;
               }
               System.out.println(x[a]);
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}