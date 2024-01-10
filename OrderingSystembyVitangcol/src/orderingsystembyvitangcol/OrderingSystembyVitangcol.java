package orderingsystembyvitangcol;
import java.util.Scanner;
public class OrderingSystembyVitangcol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a[] = {"Chicken", "Chicken Sandwich", "Spaghetti", "Mushroom Pepper Steak", "None"};
        int a2[] = {109, 62, 55, 99, 0};
        String b[] = {"Apple Pie", "Sundae", "Hashbrown", "French Fries", "None"};
        int b2[] = {29, 30, 35, 45, 0};
        String c[] = {"Juice", "Soda", "None"};
        int c2[] = {29, 39, 0};

        do {
            System.out.println("\nWelcome to my MCRodge!\n");

            int dine;
            do {
                System.out.print("Input (1) if you are going to dine in OR input (2) if you're gonna have it to-go: ");
                dine = scan.nextInt();
                if (dine != 1 && dine != 2) {
                    System.out.println();
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } while (dine != 1 && dine != 2);

            System.out.println("Menu:\nPlease choose a main dish!\n");

                        for (int i = 0; i < a.length; i++) {
                            System.out.println((i + 1) + ". " + a[i] + " - $" + a2[i]);
                        }
                        System.out.println();

                    // Scanner for Main Dish
                        System.out.print("Input number of your order here: ");
                        int order = scan.nextInt();

                        if (order < 1 || order > a.length) {
                            System.out.println("Invalid choice. Please enter a valid item number.");
                            continue; // Restart the loop to get valid input
                        }

                        int h = order - 1;
                        System.out.print("How many? : ");
                        int orderQuantity = scan.nextInt();
                        System.out.println();

                        // Display Sides with Prices
                        System.out.println("Complement it with a side!\n");
                        for (int i = 0; i < b.length; i++) {
                            System.out.println((i + 1) + ". " + b[i] + " - $" + b2[i]);
                        }
                        System.out.println();

                    // Scanner for Side Dish
                        System.out.print("Enter the number your preferred sides: ");
                        int order2 = scan.nextInt();

                        if (order2 < 1 || order2 > b.length) {
                            System.out.println("Invalid choice. Please enter a valid item number.");
                            continue; // Restart the loop to get valid input
                        }

                        int g = order2 - 1;
                        System.out.print("How many? : ");
                        int orderQuantity2 = scan.nextInt();

                    // Display Drinks with Prices
                        System.out.println("Complement it with a drink!\n");
                        for (int i = 0; i < c.length; i++) {
                            System.out.println((i + 1) + ". " + c[i] + " - $" + c2[i]);
                        }
                        System.out.println();

                    // Scanner for Drinks
                        System.out.print("Enter the number of the drink of your choice here: ");
                        int order3 = scan.nextInt();

                        if (order3 < 1 || order3 > c.length) {
                            System.out.println("Invalid choice. Please enter a valid item number.");
                            continue; // Restart the loop to get valid input
                        }

                        int f = order3 - 1;
                        System.out.print("How many? : ");
                        int orderQuantity3 = scan.nextInt();

                    // Adding the prices
                        int l = a2[h] * orderQuantity;
                        int m = b2[g] * orderQuantity2;
                        int n = c2[f] * orderQuantity3;
                        int d = l + m + n;

            // Print receipt with dining type
            System.out.println("\nTHANK YOU FOR ORDERING!");
            System.out.println("\n------------------------------ ");
            System.out.println("\nDining Type: " + (dine == 1 ? "Dine-In" : "To-Go"));
            System.out.println("\nQTY ITEM     PRICE");
            System.out.println("\n" + orderQuantity + " " + a[h] + "------ " + l);
            System.out.println(orderQuantity2 + " " + b[g] + "------ " + m);
            System.out.println(orderQuantity3 + " " + c[f] + "------ " + n);
            System.out.println("\n------------------------------");
            System.out.println("\nTotal Cost: $" + d + "\n");

            System.out.print("Enter another order? (yes = 1/no = 2): ");
            int userInput = scan.nextInt();

            if (userInput == 2) {
                System.out.println();
                System.out.println("Thank you for ordering at McRodge!");
                break; // Exit the loop if the user enters "no"
            }
        } while (true); // Infinite loop, will break when the user enters "no"
    }
}
