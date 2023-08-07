import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readPoints();
        printPointAverageAll();
        printPointAveragePassing();
        printPassPercentage();
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            this.register.addBasedOnPoints(point);
        }
    }

    public void printPointAverageAll() {
        if (this.register.getPointAverageAll() == -1) {
            System.out.println("Point average (all): -");
        } else {
            System.out.println("Point average (all): " + this.register.getPointAverageAll());
        }
    }

    public void printPointAveragePassing() {
        if (this.register.getPointAveragePassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.register.getPointAveragePassing());
        }
    }

    public void printPassPercentage() {
        if (this.register.getPassPercentage() == -1) {
            System.out.println("Pass percentage: -");
        } else {
            System.out.println("Pass percentage: " + this.register.getPassPercentage());
        }
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");

        int grade = 5;
        while (grade >= 0) {
            int stars = register.getNumberOfGrade(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();

            grade--;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
