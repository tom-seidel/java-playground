import java.util.Scanner;

public class Compare {

    public static int max(int a, int b) {

        return a > b ? a : b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int zahl2 = scanner.nextInt();

        System.out.println("The bigger number is: " + max(zahl1, zahl2));

        scanner.close();
    }

}