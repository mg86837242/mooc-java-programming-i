
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string");
        String firstInput = scanner.nextLine();

        String secondInput = scanner.nextLine();

        if (firstInput.equals(secondInput)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        scanner.close();
    }
}
