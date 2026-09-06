public class StudentMenu
{
    public static void main(String[] args)
    {
        int choice = 0;

        do
        {
            System.out.println("1. View Profile");
            System.out.println("2. View Attendance");
            System.out.println("3. Exit");

            // Assume the student selects Exit
            choice = 3;

        }
        while (choice != 3);

        System.out.println("Program ended.");
    }
}