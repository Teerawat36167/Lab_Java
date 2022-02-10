import java.util.Scanner;

public class ATM {
    public int[] id = {0,1,2,3,4,5,6,7,8,9};
    public double[] balance = {100,100,100,100,100,100,100,100,100,100};
    public int user ;
    private Scanner ac = new Scanner(System.in);

    public void login() {
        while (true) {
            System.out.print("Enter an id: ");
            this.user = ac.nextInt(); 
            if (user>9) {
                System.out.println("Enter a correct id.");
            }
            else{
                break;
            }
        }
        mainMenu();
    }

    public void mainMenu() {
        int option = 0;

        System.out.println();
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");

        option = ac.nextInt();
        option(option);
    }

    public void option(int option) {
        if (option == 1) {
            getBalance();
            mainMenu();
        }
        else if (option == 2) {
            withdraw();
            mainMenu();
        }
        else if (option == 3) {
            deposit();
            mainMenu();
        }
        else if (option == 4) {
            exit();
        }
    }    

    public void getBalance() {
        System.out.println("The balance is "+this.balance[user]);
    }

    public void withdraw() {
        System.out.print("Enter an amount to withdraw: ");
        double withdraw = ac.nextDouble();
        balance[user] -= withdraw;
    }

    public void deposit() {
        System.out.print("Enter an amount to deposit: ");
        double deposit = ac.nextDouble();
        balance[user] += deposit;
    }

    public void exit() {
        System.out.println("End of Program.");
    }
}
