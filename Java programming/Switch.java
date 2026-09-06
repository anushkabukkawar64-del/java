public class Switch {
    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("You selected Java.");
                break;
            case 2:
                System.out.println("You selected Python.");
                break;
            case 3:
                System.out.println("You selected C++.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
