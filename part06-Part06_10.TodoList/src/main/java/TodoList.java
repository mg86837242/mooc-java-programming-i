import java.util.ArrayList;

public class TodoList {
  private ArrayList<String> tasks;

  public TodoList() {
    this.tasks = new ArrayList<String>();
  }

  public void add(String task) {
    this.tasks.add(task);
  }

  public void remove(int number) {
    this.tasks.remove(number - 1);
  }

  public void print() {
    int i = 0;
    while (i < tasks.size()) {
      int number = i + 1;
      System.out.println(number + ": " + tasks.get(i));
      i++;
    }
  }
}
