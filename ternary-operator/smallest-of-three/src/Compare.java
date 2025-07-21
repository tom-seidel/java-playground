import java.util.Scanner;

public class Compare {

    public static int smallestNumber(int[] numbers) {

        return numbers[0] < numbers[1]
                ? (numbers[0] < numbers[2] ? numbers[0] : numbers[2])
                : (numbers[1] < numbers[2] ? numbers[1] : numbers[2]);        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for(int i = 0; i < num.length; i++) {

            System.out.print("Please enter a number: ");

            num[i] = sc.nextInt();
        }

        System.out.println("\nYour numbers:");
        System.out.println(num[0] + ", " + num[1] + " and " + num[2]);

        System.out.println("\nThe smallest number is: " + smallestNumber(num));

        sc.close();
    }

}
