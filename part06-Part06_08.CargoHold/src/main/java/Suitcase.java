import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Item> items;
  private int maxTotalWeight;

  public Suitcase(int maxTotalWeight) {
    this.items = new ArrayList<Item>();
    this.maxTotalWeight = maxTotalWeight;
  }

  public int totalWeight() {
    int totalWeight = 0;
    for (Item item : items) {
      totalWeight += item.getWeight();
    }
    return totalWeight;
  }

  public void addItem(Item item) {
    if (totalWeight() + item.getWeight() <= maxTotalWeight) {
      items.add(item);
    }
  }

  public Item heaviestItem() {
    if (items.size() == 0) {
      return null;
    }

    Item heaviest = items.get(0);
    for (Item item : items) {
      if (item.getWeight() > heaviest.getWeight()) {
        heaviest = item;
      }
    }
    return heaviest;
  }

  public void printItems() {
    for (Item item : items) {
      System.out.println(item.toString());
    }
  }

  @Override
  public String toString() {
    if (items.size() == 0) {
      return "no items (" + totalWeight() + " kg)";
    } else if (items.size() == 1) {
      return items.size() + " item (" + totalWeight() + " kg)";
    } else {
      return items.size() + " items (" + totalWeight() + " kg)";
    }
  }
}
