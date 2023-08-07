public class Bird {

    private String name;
    private String latinName;
    private int observedCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observedCount = 0;
    }

    public String name() {
        return name;
    }

    public String latinName() {
        return latinName;
    }

    public int observedCount() {
        return observedCount;
    }

    public void addObservation() {
        observedCount++;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observedCount + " observations";
    }

}
