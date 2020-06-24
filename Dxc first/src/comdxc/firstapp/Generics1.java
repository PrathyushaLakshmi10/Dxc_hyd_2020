package comdxc.firstapp;
import java.lang.*;
class Mygenerics<T>
{
	T obj;
	T show()
	{
		return obj;
	}
	public void display()
	{
		this.obj=obj;
	System.out.println(obj);
	}
}
public class Generics1 {
	public static void main(String[] args)
	{
		Mygenerics<Integer> mg=new Mygenerics<Integer>();
		mg.obj=10;
		System.out.println(mg.show());
		mg.display();
		
		
	}
}
