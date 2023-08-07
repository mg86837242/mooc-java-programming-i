import java.util.Scanner;

public class UserInterface {
  private TodoList todoList;
  private Scanner scanner;

  public UserInterface(TodoList todoList, Scanner scanner) {
    this.todoList = todoList;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = scanner.nextLine();

      if (command.equals("list")) {
        this.todoList.print();

        continue;
      }

      if (command.equals("add")) {
        System.out.print("To add: ");
        String addition = scanner.nextLine();

        this.todoList.add(addition);

        continue;
      }

      if (command.equals("remove")) {
        System.out.print("Which one is removed: ");
        int subtractionNum = Integer.valueOf(scanner.nextLine());

        this.todoList.remove(subtractionNum);

        continue;
      }

      if (command.equals("stop")) {
        break;
      }
    }
  }
}
