import java.util.Scanner;

public class StudentActivityManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice;

        while (true)
        {
            System.out.println("\n===== Student Activity Management System =====");
            System.out.println("1. Check Attendance Eligibility");
            System.out.println("2. View Performance Category");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Attendance Percentage: ");
                    int attendance = sc.nextInt();

                    if (attendance >= 75)
                    {
                        System.out.println("Student is Eligible for Examination.");
                    }
                    else
                    {
                        System.out.println("Student is Not Eligible for Examination.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    if (marks >= 0 && marks <= 100)
                    {
                        if (marks >= 90)
                        {
                            System.out.println("Performance: Excellent");
                        }
                        else if (marks >= 75)
                        {
                            System.out.println("Performance: Good");
                        }
                        else if (marks >= 50)
                        {
                            System.out.println("Performance: Average");
                        }
                        else
                        {
                            System.out.println("Performance: Poor");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Marks!");
                        continue;
                    }
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }

            if (choice == 3)
            {
                break;
            }
        }

        sc.close();
    }
}