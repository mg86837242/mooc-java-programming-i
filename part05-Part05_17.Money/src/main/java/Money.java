
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += (int) Math.floor(cents / 100);
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;

        if (cents > 99) {
            euros += (int) Math.floor(cents / 100);
            cents = cents % 100;
        }

        return new Money(euros, cents);
    }

    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if (cents < 0) {
            euros += (int) Math.floor(1.0 * cents / 100);
            cents = cents % 100 + 100;
        }

        return (euros >= 0 && cents >= 0) ? new Money(euros, cents) : new Money(0, 0);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros > compared.euros) {
            return false;
        }

        return this.cents < compared.cents;
    }

    @Override
    public String toString() {
        String zero = this.cents < 10 ? "0" : "";

        return this.euros + "." + zero + this.cents + "e";
    }

}
