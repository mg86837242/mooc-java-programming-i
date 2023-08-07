
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String nameInput = scanner.nextLine().trim();
            if (nameInput.isEmpty()) {
                break;
            }
            System.out.println("Publication year:");
            int yearInput = Integer.valueOf(scanner.nextLine().trim());
            Book bookInput = new Book(nameInput, yearInput);

            if (books.contains(bookInput)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(bookInput);
            }
        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
        scanner.close();
    }
}
