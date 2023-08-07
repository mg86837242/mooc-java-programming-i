
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            int age = Integer.valueOf(input.split(",")[1]);
            if (age > max) {
                max = age;
            }
        }

        System.out.println("Age of the oldest: " + max);
    }
}
