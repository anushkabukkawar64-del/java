public class Discount {
    public static void main(String args[]) {

        int amount = 1500;

        String discount = (amount >= 1000) ? "Discount Available" : "No Discount";

        System.out.println("Status : " + discount);
    }
}