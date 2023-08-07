public class Fitbyte {
  private int age;
  private int restingHeartRate;

  public Fitbyte(int age, int restingHeartRate) {
    this.age = age;
    this.restingHeartRate = restingHeartRate;
  }

  public double maximumHeartRate() {
    return 206.3 - (0.711 * this.age);
  }

  public double targetHeartRate(double percentageOfMaximum) {
    return 1.0 * (maximumHeartRate() - restingHeartRate) * percentageOfMaximum + restingHeartRate;
  }
}
