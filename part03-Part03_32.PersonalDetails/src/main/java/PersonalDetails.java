
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = "";
        int count = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            String name = pieces[0];
            int year = Integer.valueOf(pieces[1]);
            if (name.length() > longest.length()) {
                longest = name;
            }
            count++;
            sum += year;
        }

        double avg = 1.0 * sum / count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + avg);
    }
}
