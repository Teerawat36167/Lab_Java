import java.util.Scanner;

public class W2P4 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154
        
        Scanner a = new Scanner(System.in);
        String [] input = new String[3];
        System.out.print("Enter the first city: ");
        input[0] = a.nextLine();
        System.out.print("Enter the second city: ");
        input[1] = a.nextLine();
        System.out.print("Enter the third city: ");
        input[2] = a.nextLine();
        a.close();
        String [] city = new String[3];
        if (input[1].compareTo(input[0]) < 0 && input[1].compareTo(input[2]) < 0) {
            city[0] = input[1];
            if (input[2].compareTo(input[0]) < 0) {
                city[1] = input[2];
                city[2] = input[0];
            }
            else {
                city[1] = input[0];
                city[2] = input[2];
            }
        }
        else if (input[2].compareTo(input[0]) < 0 && input[2].compareTo(input[1]) < 0) {
            city[0] = input[2];
            if (input[1].compareTo(input[0]) < 0) {
                city[1] = input[1];
                city[2] = input[0];
            }
            else {
                city[1] = input[0];
                city[2] = input[1];
            }
        }
        else {
            city[0]=input[0];
            city[1]=input[1];
            city[2]=input[2];
        }
        System.out.println("The three cities in alphabetical order are " + city[0] + " " + city[1] + " " + city[2]);
    }
}