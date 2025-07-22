import java.util.Scanner;

public class Convert {

    // Convert int to binary as String
    public static String intToBinaryString(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;
            sb.insert(0, remainder);
            num /= 2;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        System.out.println("The binary string is: " + intToBinaryString(num));

        sc.close();
    }
}
