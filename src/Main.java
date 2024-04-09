import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        GuestList guestList = new GuestList();
        int option;

        do {
            menu.displayMenu();
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
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        } while (option != 4);
    }
}
