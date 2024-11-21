import java.util.Scanner;

public class javaBonusTasks {

    public static int findItem(String[] names, int[] quantities, String item){
        int index = -1;

        for (int i = 0; i < names.length; i++){
            if (names[i].equals(item)){
                index = i;
            }
        }

        return index;
    }

    public static void addStock(String[] names, int[] quantities, Scanner scanner){
        System.out.println("\n----------------Add Stock---------------");
        System.out.println("What item do you want to add stock to?:");
        String item = scanner.nextLine();
        int index = findItem(names, quantities, item);

        System.out.println("How much stock would you like to add?: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        quantities[index] += amount;


    }

    public static void removeStock(String[] names, int[] quantities, Scanner scanner){
        System.out.println("\n----------------Remove Stock---------------");
        System.out.println("What item do you want to remove stock from?:");
        String itemRemove = scanner.nextLine();
        int indexRemove = findItem(names, quantities, itemRemove);

        System.out.println("How much stock would you like to remove?: ");
        int amountRemove = scanner.nextInt();
        scanner.nextLine();

        quantities[indexRemove] -= amountRemove;
    }

    public static void displayItems(String[] names, int[] quantities){
        System.out.println("\n----------------Display Items---------------");
        for (int i = 0; i < names.length; i++){
            System.out.println((i + 1) + ". " + names[i] + " - Quantity: " + quantities[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"bananas", "apples", "oranges", "strawberry", "blueberries"};
        int[] quantities = {15, 12, 20, 45, 50};

        boolean exit = false;

        while (!exit) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add new stock to an item");
            System.out.println("2. Remove stock from an item");
            System.out.println("3. Display all items and their quantities");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addStock(names, quantities, scanner);
                    break;
                case 2:
                    removeStock(names, quantities, scanner);
                    break;
                case 3:
                    displayItems(names, quantities);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting Inventory Management System.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        

        }
        scanner.close();
    }
}