public class SmartParking
{
    public static void main(String args[])
    {
        int hours = 5;
        int rate = 40;

        int amount = hours * rate;

        boolean electricVehicle = true;
        boolean member = false;

        boolean discount = electricVehicle || member;

        System.out.println("Parking Amount : " + amount);
        System.out.println("Discount Available : " + discount);

        amount += 50;

        System.out.println("Final Amount : " + amount);
    }
}