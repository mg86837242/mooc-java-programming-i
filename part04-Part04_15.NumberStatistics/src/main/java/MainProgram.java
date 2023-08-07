
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics all = new Statistics();
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            all.addNumber(input);
            if (input % 2 == 0) {
                evens.addNumber(input);
            } else {
                odds.addNumber(input);
            }
        }

        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + evens.sum());
        System.out.println("Sum of odd numbers: " + odds.sum());
        scanner.close();
    }
}
