import java.util.ArrayList;

public class Hold {
  private ArrayList<Suitcase> suitcases;
  private int maxTotalWeight;

  public Hold(int maxTotalWeight) {
    this.suitcases = new ArrayList<Suitcase>();
    this.maxTotalWeight = maxTotalWeight;
  }

  public int totalWeight() {
    int totalWeight = 0;
    for (Suitcase suitcase : suitcases) {
      totalWeight += suitcase.totalWeight();
    }
    return totalWeight;
  }

  public void addSuitcase(Suitcase suitcase) {
    if (totalWeight() + suitcase.totalWeight() <= maxTotalWeight) {
      suitcases.add(suitcase);
    }
  }

  public void printItems() {
    for (Suitcase suitcase : suitcases) {
      suitcase.printItems();
    }
  }

  @Override
  public String toString() {
    if (suitcases.size() == 0) {
      return "no suitcases (" + totalWeight() + " kg)";
    } else if (suitcases.size() == 1) {
      return suitcases.size() + " suitcase (" + totalWeight() + " kg)";
    } else {
      return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
  }
}
