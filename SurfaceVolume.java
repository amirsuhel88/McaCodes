/* Write a program in Java using a class and two methods to calculate the Surface Area and
        Volume of a Cuboid
[Hint: Surface Area of a Cuboid= 2 (length x breadth + breadth x height + length x height)
        Volume of a Cuboid= length x breadth x height]
_____________________________________________________________________________________
                                                                                        */

import java.util.Scanner;

class Calculations{
    int length, breadth, height, area,volume;
    void insert(){
        Scanner mesure=new Scanner(System.in);
        System.out.println("Enter value for length, breadth and height: ");
        length=mesure.nextInt();
        breadth=mesure.nextInt();
        height=mesure.nextInt();
    }
    void display(){
        area= 2*(length*breadth+breadth*height+height*length);
        volume= length * breadth * height;
        System.out.println("Area of the cuboid is: "+area);
        System.out.println("Volume of the cuboid is: "+volume);
    }
}

public class SurfaceVolume {
    public static void main(String[] args)
    {
        Calculations ob1=new Calculations();
        ob1.insert();
        ob1.display();
    }

}
