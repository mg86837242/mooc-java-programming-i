
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String filename = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(",");

                String home = parts[0];
                String visit = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int visitScore = Integer.valueOf(parts[3]);

                if (home.equals(teamName)) {
                    count++;
                    if (homeScore > visitScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (visit.equals(teamName)) {
                    count++;
                    if (visitScore > homeScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

        scan.close();
    }

}
