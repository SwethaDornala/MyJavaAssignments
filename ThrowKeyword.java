package Exceptions;

public class ThrowKeyword {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException a)
		{
			System.out.println("Handled exception inside catch block");
		}
		
		

	}

}
