
import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which file should have its contents printed?");
            String fileNameInput = scanner.nextLine();

            Scanner fileScanner = new Scanner(Paths.get(fileNameInput));
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                System.out.println(row);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
