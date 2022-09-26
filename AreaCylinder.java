import java.io.*;
public class AreaCylinder {
    public static void main(String[] args) throws Exception
    {
        int r,h;
        double area;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radious of the cylinder.: ");
        r=Integer.parseInt(br.readLine());
        System.out.println("Enter the height of the cylinder: ");
        h=Integer.parseInt(br.readLine());
        area= 3.14*r*r*h;
        System.out.println("The total area of the cylinder is: "+area);
    }
}
