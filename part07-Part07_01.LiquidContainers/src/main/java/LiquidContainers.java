
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String command = scanner.nextLine();
            if (command.equals("quit")) {
                break;
            }

            if (command.matches("^add\\s\\d+")) {
                int amount = Integer.valueOf(command.substring(4));
                if (amount < 0) {
                    continue;
                }

                first = first + amount > 100 ? 100 : first + amount;
                continue;
            }

            if (command.matches("^move\\s\\d+")) {
                int amount = Integer.valueOf(command.substring(5));
                if (amount < 0) {
                    continue;
                }
                if (first < amount) {
                    amount = first;
                }

                first = first - amount < 0 ? 0 : first - amount;
                second = second + amount > 100 ? 100 : second + amount;
                continue;
            }

            if (command.matches("^remove\\s\\d+")) {
                int amount = Integer.valueOf(command.substring(7));
                if (amount < 0) {
                    continue;
                }

                second = second - amount < 0 ? 0 : second - amount;
                continue;
            }

            System.out.println("Unknown command");
        }

        scanner.close();
    }

}
