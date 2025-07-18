import java.util.Scanner;

public class Rank {

    public static String ranking(int n) {

        return n < 50 ? "Failed" : (n <= 74 ? "Passed" : "Very good");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        System.out.println(ranking(num));

        sc.close();
    }

}
