
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (!scanner.nextLine().equals("end")) {
            count++;
        }
        System.out.println(count);

        scanner.close();
    }
}
