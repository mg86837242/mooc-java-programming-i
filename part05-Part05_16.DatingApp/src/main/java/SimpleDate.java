
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void setDay(int num) {
        this.day = num;
    }

    public void setMonth(int num) {
        this.month = num;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        int accDays = this.day + howManyDays;
        if (accDays > 30) {
            setDay(accDays % 30);

            int accMonths = this.month + (int) Math.floor(accDays / 30);
            if (accMonths > 12) {
                setMonth(accMonths % 12);
                this.year += (int) Math.floor(accMonths / 12);
            } else {
                this.month += (int) Math.floor(accDays / 30);
            }

        } else {
            this.day += howManyDays;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
