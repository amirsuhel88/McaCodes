//Write a java program to implement inheritance and demonstrate use of method overriding.

class Parent 
{
    void display()
    {
        System.out.println("Has brown hair");
    }
}

class Child extends Parent
{
    void display()
    {
        System.out.println("Has Black hair");
    }
}

public class Q5
{
    public static void main(String[] args)
    {
        Child ch = new Child();
        ch.display();
    }
}
