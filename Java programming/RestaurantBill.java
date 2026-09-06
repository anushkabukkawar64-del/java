public class RestaurantBill {
    public static void main(String[] args) {
        int pizza = 480;
        int pasta = 290;
        int total = pizza + pasta;
        int difference = pizza - pasta;
        int multiple = pizza * 2;
        int average = total / 2;
        int remainder = total % 100;

        System.out.println("Total = " + total);
        System.out.println("Difference = " + difference);
        System.out.println("Double the Pizza Cost = " + multiple);
        System.out.println("Average = " + average);
        System.out.println("Remainder after 100= " + remainder);
    }
}