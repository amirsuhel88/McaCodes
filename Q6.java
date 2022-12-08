//write a java program to implement multilevel inheritance and demonstrate use of method overriding

class Grandparent
{
    void display()
    {
        System.out.println("Can fight");
    }
}

class Parent extends Grandparent
{
    void getData()
    {
        System.out.println("Can Dance");
    }
}

class Child extends Parent
{
    void setData()
    {
        System.out.println("Can Sing");
    }
}

public class Q5 {
    public static void main(String[] args)
    {
        Child ch =new Child();
        ch.setData();
        ch.display();
        ch.getData();
    }
    
}
