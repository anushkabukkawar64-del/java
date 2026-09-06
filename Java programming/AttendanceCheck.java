import java.util.Scanner;

public class AttendanceCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Attendance Percentage: ");
        int attendance = sc.nextInt();

        if (attendance >= 75)
        {
            System.out.println("Student is eligible for the examination.");
        }
        else
        {
            System.out.println("Student is not eligible for the examination.");
        }

        sc.close();
    }
}