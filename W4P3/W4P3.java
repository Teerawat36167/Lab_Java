import java.lang.Math;

public class W4P3 {
    public static void main(String[] args) {

        float [] list = new float[1000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (float) Math.random() * 1000;
        }

        System.out.println("Creating a list containing 1000 elemwnt,");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%10.2f",list[i]);
            if (i == 4) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("    ...");

        for (int i = 990; i < 1000; i++) {
            System.out.printf("%10.2f",list[i]);
            if (i == 994) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");

        StopWatch time = new StopWatch();
        selectionSort(list);
        time.stop();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%10.2f",list[i]);
            if (i == 4) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("      ...");

        for (int i = 995; i < 1000; i++) {
            System.out.printf("%10.2f",list[i]);
        }

        System.out.println();
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.\n",time.getElapsedTime());
        System.out.println("-----------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        time.start();

        int number = 2;
        int check = 0;
        while (check < 1000) {
            if (palindrome(number) && prime(number)) {
                System.out.print(number + " ");
                check++;
                if (check % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }

        time.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds.",time.getElapsedTime());
    }

    public static void selectionSort(float[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            float smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }

    static boolean palindrome(int a) {
        int palindrome;
        int check = a;
        int sum = 0;
        while (a > 0) {
            palindrome = a%10;
            sum = (sum*10) + palindrome;
            a /= 10;
        }
        if (check == sum) {
            return true;
        } else {
            return false;   
        }
    }

    static boolean prime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i == 0) {
                return false;
            }
        }
        return true;
    }
}
