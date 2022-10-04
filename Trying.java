import java.util.Scanner;
class Student
{
    String name;
    int roll;
    Student(String a, int b)
    {
        name = a;
        roll = b;
    }
    Student(Student info)
    {
        name = info.name;
        roll = info.roll;
    }
    void display()
    {
        System.out.println("your name is: " + name);
        System.out.println("Your roll no is: " + roll);
    }
}

public class Trying
{
    public static void main(String[] args)
    {
        String sname;
        int sroll;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        sname = sc.nextLine();
        System.out.println("Enter your roll no: ");
        sroll = sc.nextInt();
        Student st1 = new Student(sname, sroll);
        Student st2 = new Student(st1);
        st2.display();
        sc.close();
    }
}