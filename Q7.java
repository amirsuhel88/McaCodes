//Write a program to demonstrate use of implementing interfaces

interface Display_Interface
{
    void display();
}
interface View_Interface
{

}
interface Show_Interface extends Display_Interface, View_Interface
{
    void show();
}
 class MultiInterface implements Show_Interface
{
    public void display()
    {
        System.out.println("We all are GIMTian");
    }
    public void show()
    {
        System.out.println("We are one");
    }
    public void view()
    {
        System.out.println("Unity is out strength");
    }
}


public class Q7 {
    public static void main(String[] args){
        MultiInterface obj = new MultiInterface();
        obj.display();
        obj.show();
        obj.view();
        
    }
    
}