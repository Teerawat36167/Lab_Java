import java.util.Scanner;
import java.lang.Math;

public class W2P2 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154

        Scanner a = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = a.nextInt();
        String [] symbol = {"scissor","rock","paper"};
        a.close();
        int rand = (int)(Math.random() * 3) + 0;
        System.out.print("The computer is ");
        if (user == rand) {
            System.out.print(symbol[rand] + ". You are "+ symbol[user] + " too. It is a draw");
        }
        else if (user == 2) {
            if (rand == 1) {
                System.out.print(symbol[rand] + ". You are " + symbol[user] + ". You won");
            }
            else if (rand == 0) {
                System.out.println(symbol[rand] + ". You are " + symbol[user] + ". You lose");
            }
        }
        else if (user == 1) {
            if (rand == 2) {
                System.out.println(symbol[rand] + ". You are " + symbol[user] + ". You lose");
            }
            else if (rand == 0) {
                System.out.print(symbol[rand] + ". You are " + symbol[user] + ". You won");
            }
        }
        else if (user == 0) {
            if (rand == 1) {
                System.out.println(symbol[rand] + ". You are " + symbol[user] + ". You lose");
            }
            else if (rand == 2) {
                System.out.print(symbol[rand] + ". You are " + symbol[user] + ". You won");
            }
        }
    }
}