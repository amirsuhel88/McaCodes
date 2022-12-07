//Wrtie a java program to define a class, define instance methods and overload them and use them for dynamic method invocation
import java.util.Scanner;

class College
{   
    int roll;
    String name;
    void display(){
            System.out.println("Welcome");
    }
    void display(String name, int roll){
        this.name= name;
        this.roll = roll;
        System.out.println("Your name is: "+name);
        System.out.println("Your roll no is: "+roll);
    }
}
public class Q2 {
    public static void main(String[] args)
    {
        int roll;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your roll no: ");
        roll = sc.nextInt();

        College ob1 = new College();
        ob1.display();
        ob1.display(name,roll);
        sc.close();
    }
}
