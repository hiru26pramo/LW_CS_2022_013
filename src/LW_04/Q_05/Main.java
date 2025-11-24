package LW_04.Q_05;

import java.util.Scanner;

public class Main {

    // --- Arrays for menu items and prices ---
    static String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
    static double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

    static String[] sides = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
    static double[] sidePrices = {0.79, 0.69, 1.09, 0.59};

    static String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
    static double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};

    // --- Method to display a menu ---
    public static void displayMenu(String[] items, double[] prices, String category) {
        System.out.println("\n--- " + category + " Menu ---");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %-15s $%.2f%n", i + 1, items[i], prices[i]);
        }
    }

    // --- Method to get user choice ---
    public static int getChoice(Scanner sc, String category, int max) {
        int choice;
        while (true) {
            System.out.print("Enter your choice (1-" + max + ") for " + category + ": ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= max) break;
            System.out.println("Invalid choice! Please try again.");
        }
        return choice - 1; // return index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to MyJava Lo-Fat Burgers!");
        System.out.println("Please make your selections below:");

        // Display and get selections
        displayMenu(entrees, entreePrices, "Entree");
        int entreeChoice = getChoice(sc, "Entree", entrees.length);

        displayMenu(sides, sidePrices, "Side Dish");
        int sideChoice = getChoice(sc, "Side Dish", sides.length);

        displayMenu(drinks, drinkPrices, "Drink");
        int drinkChoice = getChoice(sc, "Drink", drinks.length);

        // Calculate total
        double total = entreePrices[entreeChoice] + sidePrices[sideChoice] + drinkPrices[drinkChoice];

        // Display summary
        System.out.println("\n--- Order Summary ---");
        System.out.printf("Entree: %-15s $%.2f%n", entrees[entreeChoice], entreePrices[entreeChoice]);
        System.out.printf("Side Dish: %-12s $%.2f%n", sides[sideChoice], sidePrices[sideChoice]);
        System.out.printf("Drink: %-15s $%.2f%n", drinks[drinkChoice], drinkPrices[drinkChoice]);
        System.out.println("-------------------------------");
        System.out.printf("Total: $%.2f%n", total);
        System.out.println("Thank you for visiting MyJava Lo-Fat Burgers!");

        sc.close();
    }
}
