import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 1500, select, number;
        boolean process = true;
        Scanner inp = new Scanner(System.in);

        while (right > 0) {
            System.out.print("User Name Enter :");
            userName = inp.nextLine();
            System.out.print("Password Enter :");
            password = inp.nextLine();
            if (userName.equals("atabay") && password.equals("atabay123")) {
                System.out.println("Hello Welcome To Atabay Bank.");

                while (process) {
                    System.out.println("1-Withdraw Money");
                    System.out.println("2-Deposit Money");
                    System.out.println("3-Question Balance");
                    System.out.println("4-Exit");
                    System.out.print("Please Selected Process : ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Money Price :");
                            int price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= price;
                                System.out.println("Available balance :" + balance);
                            }
                            break;
                        case 2:
                            System.out.println("Money Price :");
                            int price1 = inp.nextInt();
                            balance += price1;
                            System.out.println("Total Balnace : " + balance);
                            break;
                        case 3:
                            System.out.println("Total Balance : " + balance);
                            break;
                        case 4:
                            System.out.println("Exit");
                            process = false;
                            break;
                        default:
                            System.out.println("Try Again");
                            process = false;
                            right -= 1;
                            break;

                    }
                }
            } else {
                right--;
                System.out.println("Invalid Enter.Try Again");
                if (right == 0) {
                    System.out.println("Contact the bank!");
                } else {
                    System.out.println("Your remaining right :" + right);
                }
            }
        }
    }
}
