import java.util.Scanner;

public class Bonus {

    public static int bonus(int num) {

        return num < 5 ? 0 : (num > 10 ? 10 : num);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your score: ");
        int score = sc.nextInt();

        System.out.println(bonus(score));

        sc.close();
    }

}
