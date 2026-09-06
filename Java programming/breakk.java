public class breakk {
    public static void main(String[] args) {

        int targetRollNo = 104;

        for (int rollNo = 1; rollNo <= 110; rollNo++) {

            System.out.println("Checking roll no: " + rollNo);

            if (rollNo == targetRollNo) {
                System.out.println("Student found");
                break;
            }
        }
    }
}