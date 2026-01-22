import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------ FOOD MENU ------");
        System.out.println("Dosa  - ₹40");
        System.out.println("Idli  - ₹30");
        System.out.println("Biryani - ₹150");
        System.out.println("Fried Rice - ₹120");
        System.out.print("Enter your choice: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "Dosa":
                System.out.println("You ordered Dosa.");
                System.out.println("Price: ₹40");
                break;

            case "Idli":
                System.out.println("You ordered Idli.");
                System.out.println("Price: ₹30");
                break;

            case "Biryani":
                System.out.println("You ordered Biryani.");
                System.out.println("Price: ₹150");
                break;

            case "Fried Rice":
                System.out.println("You ordered Fried Rice.");
                System.out.println("Price: ₹120");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        System.out.println("Thank you for ordering!");
    }
}
