//Wrtie java program to demonstrate use of sub class
import java.util.*;
import java.io.*;
class Vehicle
{
    void setData()
    {
        System.out.println("Has a Engine");
        System.out.println("Has wheels");
    }
}
class Car extends Vehicle
{
    void getData()
    {
        System.out.println("Has a steering");
        System.out.println("has wiper");
    }
}
public class Q3 {
    public static void main(String[] args)
    {
        Car ob1= new Car(); 
        ob1.setData();
        ob1.getData();

    }
}
