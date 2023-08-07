import java.util.ArrayList;

public class BirdList {

    public ArrayList<Bird> birdList = new ArrayList<Bird>();

    public BirdList() {
        this.birdList = new ArrayList<Bird>();
    }

    public void add(Bird added) {
        for (Bird b : birdList) {
            if (b.name().equals(added.name())) {
                System.out.println("Bird already exists.");
                return;
            }
        }

        birdList.add(added);
    }

    public void addObservation(String observed) {
        int count = 0;

        for (Bird b : birdList) {
            if (b.name().equals(observed)) {
                b.addObservation();
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Not a bird!");
        }
    }

    public void printAll() {
        int count = birdList.size();

        while (count > 0) {
            Bird b = birdList.get(count - 1);
            System.out.println(b);
            count--;
        }

    }

    public void printOne(String printed) {
        int count = 0;

        for (Bird b : birdList) {
            if (b.name().equals(printed)) {
                System.out.println(b);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Not a bird!");
        }
    }

}
