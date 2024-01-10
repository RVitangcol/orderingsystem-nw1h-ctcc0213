package orderingsystembyvitangcol;
import java.util.Scanner;
public class OrderingSystembyVitangcol {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String mainCourse[] = {"Chicken", "Chicken Sandwich", "Spaghetti", "Mushroom Pepper Steak", "None"};
        int mcPrices[] = {109, 62, 55, 99, 0};
        String sideDish[] = {"Apple Pie", "Sundae", "Hashbrown", "French Fries", "None"};
        int sdPrices[] = {29, 30, 35, 45, 0};
        String drinks[] = {"Juice", "Soda", "None"};
        int drinksPrices[] = {29, 39, 0};

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

                        for (int i = 0; i < mainCourse.length; i++) {
                            System.out.println((i + 1) + ". " + mainCourse[i] + " - $" + mcPrices[i]);
                        }
                        System.out.println();

                    // Scanner for Main Dish
                        System.out.print("Input number of your order here: ");
                        int mcNumber = scan.nextInt();

                        if (mcNumber < 1 || mcNumber > mainCourse.length) {
                            System.out.println("Invalid choice. Please enter a valid item number.");
                            continue; // Restart the loop to get valid input
                        }
                        int mcPlacing = mcNumber - 1;
                        
                    // Scanner for Main Dish Quantity
                        int orderQuantity = 0;
                        if (mcNumber != mainCourse.length) {
                            System.out.print("How many? : ");
                            orderQuantity = scan.nextInt();
                        }
                        System.out.println();

                    // Display Sides with Prices
                        System.out.println("Complement it with a side!\n");
                        for (int i = 0; i < sideDish.length; i++) {
                            System.out.println((i + 1) + ". " + sideDish[i] + " - $" + sdPrices[i]);
                        }
                        System.out.println();

                    // Scanner for Side Dish
                        System.out.print("Enter the number your preferred sides: ");
                        int sdNumber = scan.nextInt();

                        if (sdNumber < 1 || sdNumber > sideDish.length) {
                            System.out.println("Invalid choice. Please enter a valid item number.");
                            continue; // Restart the loop to get valid input
                        }
                        int sdPlacing = sdNumber - 1;
                        
                    // Scanner for Side Dish Quantity 
                        int orderQuantity2 = 0;
                        if (sdNumber != sideDish.length) {
                            System.out.print("How many? : ");
                            orderQuantity2 = scan.nextInt();
                        }
                        System.out.println();

                    // Display Drinks with Prices
                        System.out.println("Complement it with a drink!\n");
                        for (int i = 0; i < drinks.length; i++) {
                            System.out.println((i + 1) + ". " + drinks[i] + " - $" + drinksPrices[i]);
                        }
                        System.out.println();

                    // Scanner for Drinks
                        System.out.print("Enter the number of the drink of your choice here: ");
                        int dNumber = scan.nextInt();

                        if (dNumber < 1 || dNumber > drinks.length) {
                            System.out.println("Invalid choice. Please enter a valid item number.");
                            continue; // Restart the loop to get valid input
                        } 
                        int dPlacing = dNumber - 1;
                        
                    // Scanner for Drinks Quantity 
                        int orderQuantity3 = 0;
                        if (dNumber != drinks.length) {
                            System.out.print("How many? : ");
                            orderQuantity3 = scan.nextInt();
                        }
                        System.out.println();

                    // Adding the prices
                        int l = mcPrices[mcPlacing] * orderQuantity; // Main Course multiplier
                        int m = sdPrices[sdPlacing] * orderQuantity2;// Side Course multiplier
                        int n = drinksPrices[dPlacing] * orderQuantity3;// Drinks multiplier
                        int sumofAll = l + m + n;

            // Print receipt with dining type
            System.out.println("\nTHANK YOU FOR ORDERING!");
            System.out.println("\n------------------------------ ");
            System.out.println("\nDining Type: " + (dine == 1 ? "Dine-In" : "To-Go"));
            System.out.println("\nQTY ITEM ------ PRICE");
            
            // If the user choose none
            
            if (orderQuantity > 0) {
                System.out.println("\n" + orderQuantity + "  " + mainCourse[mcPlacing] + " ------ " + l);
            }
            if (orderQuantity2 > 0) {
                System.out.println(orderQuantity2 + "  " + sideDish[sdPlacing] + " ------ " + m);
            }
            if (orderQuantity3 > 0) {
                System.out.println(orderQuantity3 + "  " + drinks[dPlacing] + " ------ " + n);
            }
            System.out.println("\n------------------------------");
            System.out.println("\nTotal Cost: $" + sumofAll + "\n");

            //
            //scan.nextLine();

        System.out.print("Enter another order? (input 'yes' to continue or 'no' to exit): ");
        String userInput = scan.nextLine();

        if (userInput.equalsIgnoreCase("no")) {
            System.out.println("Thank you for ordering at McRodge!");
            break; // Exit the loop if the user enters "no"
        } else if (userInput.equalsIgnoreCase("yes")) {
            // Continue the loop for another order
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            // Optionally, you can choose to continue the loop here or handle it as needed
        }
        } while (true); // Infinite loop, will break when the user enters "no"
    }
}
