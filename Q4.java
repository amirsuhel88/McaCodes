//Write a program to demonstrate use of nested class
class GIMTStudent
 {
    int roll_no=12;
    String name = "Amir";
    private class MCAStudent
    {
        void profile()
        {
            System.out.println("Name is: "+name+"and Roll no is: "+roll_no);
        }
    }
    void display()
    {
        MCAStudent ob1 = new MCAStudent();
        ob1.profile();
    }
}
public class Q4
{
    public static void main(String[] args)
    {
        GIMTStudent ob = new GIMTStudent();
        ob.display();
    }
}