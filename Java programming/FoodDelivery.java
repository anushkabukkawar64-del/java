import java.util.Scanner;

class FoodDelivery {

    String[] partner = {"Zomato", "Swiggy", "UberEats", "Blinkit", "Zepto"};
    String[] parameter = {"Delivery Speed", "Food Quality", "Packaging", "Service"};

    int[][] rating = new int[5][4];
    int[] total = new int[5];

    // Input Method
    void input(Scanner sc) {
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter ratings for " + partner[i]);
            for (int j = 0; j < 4; j++) {
                System.out.print(parameter[j] + " : ");
                rating[i][j] = sc.nextInt();
            }
        }
    }

    // Method with parameter passing
    int calculateTotal(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method Overloading
    double calculateAverage(int total) {
        return total / 4.0;
    }

    double calculateAverage(int total, int subjects) {
        return total / (double) subjects;
    }

    // Store totals in 1-D array
    void storeTotals() {
        for (int i = 0; i < 5; i++) {
            total[i] = calculateTotal(rating[i]);
        }
    }

    // Display totals and averages
    void display() {
        System.out.println("\nPartner Details");
        for (int i = 0; i < 5; i++) {
            System.out.println(partner[i]);
            System.out.println("Total = " + total[i]);
            System.out.println("Average = " + calculateAverage(total[i]));
            System.out.println();
        }
    }

    // Linear Search
    void linearSearch(int key) {
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (rating[i][j] == key) {
                    System.out.println("Rating " + key + " found in "
                            + partner[i] + " (" + parameter[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Rating not found.");
        }
    }

    // Bubble Sort
    void bubbleSort() {
        for (int i = 0; i < total.length - 1; i++) {
            for (int j = 0; j < total.length - 1 - i; j++) {
                if (total[j] < total[j + 1]) {

                    int temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;

                    String t = partner[j];
                    partner[j] = partner[j + 1];
                    partner[j + 1] = t;
                }
            }
        }

        System.out.println("\nRanking (Highest to Lowest)");
        for (int i = 0; i < total.length; i++) {
            System.out.println(partner[i] + " : " + total[i]);
        }
    }

    // Highest Rated Partner
    void displayHighest() {
        System.out.println("\nHighest Rated Delivery Partner");
        System.out.println(partner[0] + " with Total Rating = " + total[0]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodDelivery obj = new FoodDelivery();

        obj.input(sc);

        obj.storeTotals();

        obj.display();

        System.out.print("Enter rating to search: ");
        int key = sc.nextInt();

        obj.linearSearch(key);

        obj.bubbleSort();

        obj.displayHighest();

        sc.close();
    }
}