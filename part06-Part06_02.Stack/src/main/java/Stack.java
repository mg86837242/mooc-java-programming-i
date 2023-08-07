import java.util.ArrayList;

public class Stack {
  private ArrayList<String> strings;

  public Stack() {
    this.strings = new ArrayList<>();
  }

  public boolean isEmpty() {
    return strings.isEmpty();
  }

  public void add(String value) {
    strings.add(value);
  }

  public ArrayList<String> values() {
    return this.strings;
  }

  public String take() {
    int lastIdx = strings.size() - 1;
    return strings.remove(lastIdx);
  }
}
