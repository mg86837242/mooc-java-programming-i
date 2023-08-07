
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input = scanner.nextLine();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] pieces = input.split(" ");
                String result = String.join("\n", pieces);
                System.out.println(result);
            }
        }
    }
}
