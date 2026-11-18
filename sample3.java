import java.util.Scanner;

public class sample3 {
    public static void main(String args[]) {
        boolean flagmain = true;
        int numtrans = 0;

        Scanner input = new Scanner(System.in);
        boolean flag1 = true;
        boolean flag2 = true;

        while (flagmain) {
            int balance = 0;
            int pizza = 0;
            int top = 0;

            while (flag1) {
                System.out.println("\n=== Pizza Ordering Kiosk ===");
                System.out.println("(300) 1 - Cheese Pizza");
                System.out.println("(250) 2 - Pepperoni");
                System.out.println("(350) 3 - Hawaiian");
                System.out.print("Select your pizza (1-3): ");

                String choice1 = input.nextLine().trim();

                if (choice1.equals("1")) {
                    balance += 300;
                    pizza += 300;
                    flag1 = false;
                } else if (choice1.equals("2")) {
                    balance += 250;
                    pizza += 250;
                    flag1 = false;
                } else if (choice1.equals("3")) {
                    balance += 350;
                    pizza += 350;
                    flag1 = false;
                } else {
                    System.out.println("Invalid Input.");
                }
            }

            while (flag2) {
                System.out.println("\n=== Any Toppings In Mind? ===");
                System.out.println("(+25) 1 - Mushroom");
                System.out.println("(+35) 2 - Olive");
                System.out.println("(+40) 3 - Mozzarella");
                System.out.println("None (4)");
                System.out.print("Select your toppings (1-4): ");

                String choice2 = input.nextLine().trim();

                if (choice2.equals("1")) {
                    balance += 25;
                    top += 25;
                    flag2 = false;
                } else if (choice2.equals("2")) {
                    balance += 35;
                    top += 35;
                    flag2 = false;
                } else if (choice2.equals("3")) {
                    balance += 40;
                    top += 40;
                    flag2 = false;
                } else if (choice2.equals("4")) {
                    flag2 = false;
                } else {
                    System.out.println("Invalid Input.");
                }
            }

            numtrans++;
            System.out.println("\n==== Receipt ====");
            System.out.println("Pizza    :     " + pizza);
            System.out.println("Toppings :     " + top);
            System.out.println("Total    :     " + balance);

            boolean flag3 = true;
            while (flag3) {
                System.out.print("Would you like another transaction? (y/n): ");
                String choice3 = input.nextLine().trim();

                if (choice3.equalsIgnoreCase("y")) {
                    flag1 = true;
                    flag2 = true;
                    flag3 = false;
                    flagmain = true;
                } else if (choice3.equalsIgnoreCase("n")) {
                    flag1 = false;
                    flag2 = false;
                    flag3 = false;
                    flagmain = false;
                    System.out.println("Transaction Ended.");
                    System.out.println("Total Transactions: " + numtrans);
                } else {
                    System.out.println("Invalid Input.");
                }
            }
        }

        input.close();
    }
}