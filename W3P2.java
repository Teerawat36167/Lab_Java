import java.util.Scanner;
import java.util.Arrays;

public class W3P2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter list1: ");
        String input1 = a.nextLine();
        System.out.print("Enter list2: ");
        String input2 = a.nextLine();
        a.close();
        String [] list1 = input1.split(" ");
        String [] list2 = input2.split(" ");
        
        int [] num1 = new int[list1.length];
        int [] num2 = new int[list2.length];
        for (int i = 0; i < list1.length; i++) {
            num1[i] = Integer.parseInt(list1[i]);
        }
        for (int i = 0; i < list2.length; i++) {
            num2[i] = Integer.parseInt(list2[i]);
        }
        int [] merge = merge(num1, num2);
        System.out.print("The merged list is ");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }

    public static int[] merge(int[] list1,int[] list2) {
        int [] merge = new int[list1.length+list2.length];
        System.arraycopy(list1, 0, merge, 0, list1.length);
        System.arraycopy(list2, 0, merge, list1.length, list2.length);
        Arrays.sort(merge);
        return merge;
    }
}