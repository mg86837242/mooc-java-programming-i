
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        while (true) {
            System.out.print("First Name: ");
            String first = scanner.nextLine();
            if (first.isEmpty()) {
                break;
            }
            System.out.print("Last Name: ");
            String last = scanner.nextLine();
            System.out.print("Identification number: ");
            String id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(first, last, id));
        }

        System.out.println();
        for (PersonalInformation ic : infoCollection) {
            System.out.println(ic.getFirstName() + " " + ic.getLastName());
        }

        scanner.close();
    }
}
