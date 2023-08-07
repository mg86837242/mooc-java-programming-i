public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount = this.amount + amount > 100 ? 100 : this.amount + amount;
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount = this.amount - amount < 0 ? 0 : this.amount - amount;
    }

    @Override
    public String toString() {
        return this.contains() + "/100";
    }

}
