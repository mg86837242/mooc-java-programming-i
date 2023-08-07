import java.util.Scanner;

public class TextUI {
  private Scanner scanner;
  private SimpleDictionary simpleDictionary;

  public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
    this.scanner = scanner;
    this.simpleDictionary = simpleDictionary;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scanner.nextLine();

      if (command.equals("end")) {
        System.out.println("Bye bye!");
        break;
      }

      if (command.equals("add")) {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        this.simpleDictionary.add(word, translation);
        continue;
      }

      if (command.equals("search")) {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();

        String searchResult = this.simpleDictionary.translate(word);

        if (searchResult != null) {
          System.out.println("Translation: " + searchResult);
        } else {
          System.out.println("Word " + word + " was not found");
        }

        continue;
      }

      System.out.println("Unknown command");
    }
  }
}
