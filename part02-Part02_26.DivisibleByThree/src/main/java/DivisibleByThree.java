
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        int x = 2;
        int y = 15;
        divisibleByThreeInRange(x, y);
    }

    public static void divisibleByThreeInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
