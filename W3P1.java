import java.lang.Math;

//Math sqrt

public class W3P1 {

    static int palindrome;
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154

        int number = 2;
        int check = 0;
        while (check < 100) {
            if (palindrome(number) && prime(number)) {
                System.out.print(number + " ");
                check++;
                if (check % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    static boolean palindrome(int a) {
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
