import java.util.Scanner;
import java.util.ArrayList;

public class GuestList {

    private final ArrayList<String> guests = new ArrayList<>();

    public void displayGuests() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Guests ");
        if (guests.isEmpty()) {
            System.out.println();
            System.out.println("No guests found.");
        } else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ". " + guests.get(i));
            }
        }
    }
    public void addGuests (Scanner scanner){
        boolean addMore = true;
        while (addMore) {
            System.out.print("Name:");
            String name = scanner.nextLine();
            guests.add(name);
            System.out.println(name + " has been added.");
            System.out.println("Add more guests?: y/n");
            String choice = scanner.nextLine().toLowerCase();
            while (!(choice.equals("y") || choice.equals("n"))) {
                System.out.println("Please enter a valid answer (y/n)");
                choice = scanner.nextLine().toLowerCase();
            }
            if (choice.equals("n")) {
                    addMore = false;
            }
        }
    }
    public void removeGuests (Scanner scanner){
        boolean isEmpty = true;
        for (String guest : guests) {
            if (guest != null && !guest.isEmpty()) {           //  null: no object, empty: object with nothing in it
                isEmpty = false;
                break;
            }
        }
        if(isEmpty){
            System.out.println("There are no guests in the list.");
            return;
        }
        boolean removeMore = true;
        while (removeMore) {
            System.out.print("Name:");
            String name = scanner.nextLine();
            boolean guestFound = guests.remove(name);
            if (guestFound) {
                System.out.println(name + " has been removed.");
            } else {
                System.out.println("Guest not found.");
            }
            System.out.println("Remove more guests?: y/n");
            String choice = scanner.nextLine().toLowerCase();
            while (!(choice.equals("y") || choice.equals("n"))) {
                System.out.println("Please enter a valid answer (y/n)");
                choice = scanner.nextLine().toLowerCase();
            }
            if (choice.equals("n")) {
                removeMore = false;
            }
        }
    }
}