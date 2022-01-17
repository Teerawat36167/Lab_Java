import java.util.Scanner;

public class W2P5 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = a.nextInt();
        a.close();
        int floor = 1;
        for (int i = line; i > 0; i--) {
            int left = floor;
            int right = 2;
            for (int j = i-1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = (2*floor)-1; j >= 1; j--) {
                if (left > 0) {
                    System.out.print(left + " ");
                    left--;
                }
                else {
                    System.out.print(right + " ");
                    right++;
                }    
            }
            floor++;
            System.out.println();
        }
    }
}
