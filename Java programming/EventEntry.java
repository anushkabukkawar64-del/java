// import java.util.Scanner;

// public class AssignmentCheck
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Has the assignment been submitted? (true/false): ");
//         boolean submitted = sc.nextBoolean();

//         if (submitted)
//         {
//             System.out.println("Assignment submitted successfully.");
//             System.out.println("Marks Awarded: 10");
//         }
//         else
//         {
//             System.out.println("Assignment not submitted.");
//             System.out.println("Marks Awarded: 0");
//         }

//         sc.close();
//     }
// }



public class EventEntry {
    public static void main(String[]args) {

        boolean registered = true;
        int age = 20;

        if (registered ) {
            if (age >= 18) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("Entry denied. Age must be 18 or older.");
            } 
        } else {
            System.out.println("Entry denied. Registration required.");
        }
    }
}

