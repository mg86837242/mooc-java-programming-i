
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a nubmer:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                positiveCount++;
                sum = sum + num;
            } else {
                continue;
            }
        }

        if (positiveCount > 0) {
            double positiveAvg = 1.0 * sum / positiveCount;
            System.out.println(positiveAvg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
