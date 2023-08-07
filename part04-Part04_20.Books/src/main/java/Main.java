import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String titleInput = scanner.nextLine();
            if (titleInput.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pagesInput = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int yearInput = Integer.valueOf(scanner.nextLine());
            books.add(new Book(titleInput, pagesInput, yearInput));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String infoType = scanner.nextLine();
        if (infoType.equals("everything")) {
            for (Book b : books) {
                System.out.println(b.getEverything());
            }
        }
        if (infoType.equals("name")) {
            for (Book b : books) {
                System.out.println(b.getName());
            }
        }

        scanner.close();
    }
}
