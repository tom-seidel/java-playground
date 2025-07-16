import java.util.Scanner;

public class EvenOdd {

    public static String evenOdd(int n) {

        return n % 2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(evenOdd(num));

        sc.close();
    }
}
