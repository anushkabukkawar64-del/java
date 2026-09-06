public class LibraryAccess
{
    public static void main(String args[])
    {
        boolean idCard = true;
        boolean feePaid = true;
        boolean collegeID = false;
        boolean cgpa = false;
        boolean hackathonwinner = true;


        System.out.println("AND: " + (idCard && feePaid));
        System.out.println("OR: " + (idCard || collegeID));
        System.out.println("NOT: " + (!collegeID));
        System.out.println(cgpa || hackathonwinner);

    }
}