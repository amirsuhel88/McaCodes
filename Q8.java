interface Display_Interface
{
	void display();
}
interface View_Interface
{
	void view();
}

interface Show_Interface extends Display_Interface, View_Interface
{
	void show();
}

public class Q8 implements Show_Interface
{
	public void display()
	{
		System.out.println("We are GIMTian");
	}
	public void show()
	{
		System.out.println("We are one");
		
	}
	public void view()
	{
		System.out.println("Unity is our Strength");
	}
	
	public static void main(String[] args)
	{
		Q8 ob = new Q8();
		ob.display();
		ob.show();
		ob.view();
	}
}
