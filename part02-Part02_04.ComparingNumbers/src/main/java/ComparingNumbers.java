
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String result = num1 == num2 ? " is equal to " : num1 < num2 ? " is smaller than " : " is greater than ";
        System.out.println(num1 + result + num2 + '.');
    }
}
