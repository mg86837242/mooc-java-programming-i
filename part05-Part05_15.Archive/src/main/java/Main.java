
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String idInput = scanner.nextLine().trim();
            if (idInput.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine().trim();
            if (nameInput.isEmpty()) {
                break;
            }

            Item itemInput = new Item(idInput, nameInput);
            if (items.contains(itemInput)) {
                System.out.println("duplicate!!!");
                continue;
            } else {
                items.add(itemInput);
            }
        }

        System.out.println("==Items==");
        for (Item i : items) {
            System.out.println(i.toString());
        }

        scanner.close();
    }
}
