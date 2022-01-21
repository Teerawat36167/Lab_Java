public class W4P3 {
    static int palindrome;
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        System.out.println(time.start());
        System.out.println(time.stop());
        System.out.println(time.getElapsedTime());
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
