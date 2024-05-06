import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    GuestList guestList = new GuestList();

    public void displayMenu() {
        int option;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Menu ");
            System.out.println();
            System.out.println("1 - Display All Guests");
            System.out.println("2 - Add Guest");
            System.out.println("3 - Remove Guest");
            System.out.println("4 - Exit");
            System.out.println();
            System.out.print("Option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (option) {
                case 1:
                    guestList.displayGuests();
                    break;
                case 2:
                    guestList.addGuests(scanner);
                    break;
                case 3:
                    guestList.removeGuests(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Guest List App!");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        } while (option != 4);
    }
}
