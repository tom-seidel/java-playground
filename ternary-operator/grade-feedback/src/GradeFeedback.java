import java.util.Scanner;

public class GradeFeedback {

    public static String getFeedback(int points) {
        return points < 0 ? "Invalid"
                : points <= 39 ? "Poor"
                : points <= 59 ? "Sufficient"
                : points <= 79 ? "Good"
                : points <= 100 ? "Very good"
                : "Excessive!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a score to evaluate the grade:");
        int points = scanner.nextInt();

        System.out.println("Your grade: " + getFeedback(points));

        scanner.close();
    }
}
