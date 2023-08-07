import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdList birdList;

    public UserInterface(Scanner scanner, BirdList birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }

    public void start() {
        readCommand();
    }

    public void readCommand() {
        loop: while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            switch (command) {
                case "Quit":
                    break loop;
                case "Add":
                    System.out.print("Name: ");
                    String birdName = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String birdLatinName = scanner.nextLine();
                    Bird added = new Bird(birdName, birdLatinName);
                    birdList.add(added);
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String observed = scanner.nextLine();
                    birdList.addObservation(observed);
                    break;
                case "All":
                    birdList.printAll();
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String printed = scanner.nextLine();
                    birdList.printOne(printed);
                    break;
                default:
                    System.out.println("Unknown command: " + command);

            }
        }
    }

}