public class VisitorCounter
{
    public static void main(String args[])
    {
        int visitors = 250;
        visitors++; // post increment

        System.out.println("After New Entry = " + visitors);
        visitors++; // post decrement

        System.out.println("After Exit = " + visitors);
    }
}