import java.util.Scanner;

public class ReadUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter numbers (negative number to stop):");

        while (true) {
            num = sc.nextInt();

            if (num < 0) {
                break; 
            }

            System.out.println("You entered: " + num);
        }

        System.out.println("Negative number entered. Program stopped.");
        sc.close();
    }
}
