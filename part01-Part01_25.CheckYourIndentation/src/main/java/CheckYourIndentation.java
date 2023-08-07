
import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give another number: ");
        int num2 = Integer.valueOf(scan.nextLine());

        if (num1 == num2) {
            System.out.println("Same!");
        } else if (num1 > num2) {
            System.out.println("The first was larger than the second!");
        } else {
            System.out.println("The second was larger than the first!");
        }

        scan.close();
    }
}
