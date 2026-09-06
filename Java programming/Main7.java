public class Main7 {

    public static void main(String[] args) {

        int[] numbers = {15, 21, 12, 36, 40};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}