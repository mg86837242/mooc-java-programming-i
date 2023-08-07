import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<Integer>();
        this.grades = new ArrayList<Integer>();
    }

    public double getPointAverageAll() {
        if (this.points.isEmpty()) {
            return -1;
        }

        double sum = 0;
        for (int g : points) {
            sum += g;
        }
        return 1.0 * sum / points.size();
    }

    public double getPointAveragePassing() {
        if (this.points.isEmpty()) {
            return -1;
        }

        double sum = 0;
        int count = 0;
        for (int g : points) {
            if (g >= 50) {
                sum += g;
                count++;
            }
        }
        return count == 0 ? -1 : 1.0 * sum / count;
    }

    public double getPassPercentage() {
        if (this.points.isEmpty()) {
            return -1;
        }

        double sum = 0;
        double passingSum = 0;
        for (int g : this.points) {
            sum++;
            if (g >= 50) {
                passingSum++;
            }
        }
        return passingSum / sum * 100;
    }

    public int getNumberOfGrade(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public void addBasedOnPoints(int points) {
        if (points < 0 || points > 100) {
            return;
        }
        this.points.add(points);
        this.grades.add(getGradeFromPoints(points));
    }

    public static int getGradeFromPoints(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
