
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int value = Integer.valueOf(scanner.nextLine());
        int result = value * 86400;
        System.out.println("" + result);

        scanner.close();
    }
}
