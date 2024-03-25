package Inheritance;
class Parent5
{
	Parent5()
	{
		this(20);
		System.out.println("const 1");
	}
	Parent5(int a)
	{
		this(12.4);
		System.out.println("const 2");
	}
	Parent5(char c)
	{
		this("swetha",40);
		System.out.println("const 3");
	}
	Parent5(String a,int b)
	{
		System.out.println("const 4");
	}
	Parent5(double b)
	{
		this('s');
		System.out.println("const 5");
	}
	
}

public class thiscallingstatement extends Parent5 {
	/*thiscallingstatement()
	{
		super(34.5);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiscallingstatement t=new thiscallingstatement();
		

	}

}
