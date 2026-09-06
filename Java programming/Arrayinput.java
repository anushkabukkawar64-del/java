import java.util.Scanner;

public class Arrayinput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}