import java.util.Scanner;

class Parent
{
    String name, des;
    int earn;
    Scanner sc = new Scanner(System.in);
    void setData(){

        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your Earning: ");
        earn = sc.nextInt();
    }
    void getData(){
        System.out.println("Your name is: " + name);
        System.out.println("Your earning is: " + earn);
    }
}
class Child1 extends Parent
{
    String add;
    Scanner sc = new Scanner(System.in);
    void info(){
        System.out.println("Enter your address: ");
        add = sc.nextLine();
        System.out.println("Your address is: " + add);
    }
}
class Child2 extends Parent
{
    Scanner sc = new Scanner(System.in);
    void info(){
        System.out.println("Enter your description: ");
        des = sc.nextLine();
        System.out.println("Your Description is: " + des);
    }
}

public class MultiLevel 
{    
    public static void main(String[] args){

        Parent pa = new Parent();
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        pa.setData();
        ch1.setData();
        ch1.getData();
        ch1.info();
       // ch2.setData();
      //  ch2.getData();
        ch2.info();
    }
}
