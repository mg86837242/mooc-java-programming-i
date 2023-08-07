
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int input1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int input2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int input3 = Integer.valueOf(scanner.nextLine());
        int sum = input1 + input2 + input3;
        System.out.println("The sum of the numbers is " + sum);

        scanner.close();
    }
}
