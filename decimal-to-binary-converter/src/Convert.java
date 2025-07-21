import java.util.Scanner;

public class Convert {

    // Convert int to binary as String
    public static String intToBinaryString(int num) {
        if (num == 0) return "0";

        String binaryString = "";
        while (num > 0) {
            int remainder = num % 2;
            binaryString = remainder + binaryString;
            num /= 2;
        }

        return binaryString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        System.out.println("The binary string is: " + intToBinaryString(num));

        sc.close();
    }
}
