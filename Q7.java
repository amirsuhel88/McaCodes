//Write a program to demonstrate use of implementing interfaces

interface Display_Interface
{
    void display();
}
interface Show_Interface
{
    void show();
}
 class MultiInterface implements Display_Interface, Show_Interface
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
