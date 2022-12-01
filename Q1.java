// Q1. Write a java program to define a class, describe its constructor, overload the constructor and instantiate its object
import java.util.Scanner;

class College
{   
    int roll;
    String name;
    College()
    {
      System.out.println("Welcome to GIMT");
    }
    College(String sname, int sroll)
    {
        name = sname;
        roll = sroll;
        System.out.println("Student name is: "+name);
        System.out.println("student roll no is: "+roll);
    }
    College(College ob1)
    {
        this.name = ob1.name;
        this.roll = ob1.roll;
        System.out.println("your name is: "+ name);
        System.out.println("Your roll no is: "+ roll);

    }
}

public class Q1 {
    public static void main(String[] args)
    {
        int sroll;
        String sname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        sname= sc.nextLine();
        System.out.println("Enter your roll no: ");
        sroll = sc.nextInt();
        College ob = new College();
        College ob1 = new College(sname,sroll);
        College ob2 = new College(ob1);
        sc.close();
    }
    
}
