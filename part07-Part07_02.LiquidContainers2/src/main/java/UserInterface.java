import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container first;
    private Container second;

    public UserInterface(Scanner scanner, Container first, Container second) {
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            if (input.matches("^add\\s\\d+")) {
                int amount = Integer.valueOf(input.substring(4));
                first.add(amount);

                continue;
            }

            if (input.matches("^move\\s\\d+")) {
                int amount = Integer.valueOf(input.substring(5));
                if (amount < 0 || amount > first.contains()) {
                    amount = first.contains();
                }

                first.remove(amount);
                second.add(amount);

                continue;
            }

            if (input.matches("^remove\\s\\d+")) {
                int amount = Integer.valueOf(input.substring(7));
                second.remove(amount);

                continue;
            }

            System.out.println("Unknown command");
        }
    }
}
