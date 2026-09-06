// public class bubblesort {

//     static void bubbleSort(int arr[], int n) {
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {

//                 if (arr[j] > arr[j + 1]) {
//                     // Swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = {7, 4, 5, 2};
//         int n = arr.length;

//         bubbleSort(arr, n);

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and marks: ");
            String name = sc.next();
            int marks = sc.nextInt();

            s[i] = new Student(name, marks);
        }

        // Sorting by marks
        Arrays.sort(s, (a, b) -> a.marks - b.marks);

        // Output
        System.out.println("\nSorted by marks:");

        for (int i = 0; i < n; i++) {
            System.out.println(s[i].name + " - " + s[i].marks);
        }

        sc.close();
    }
}