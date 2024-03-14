package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchwithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Scanner s=new Scanner(System.in);
			int b[]=new int[3];
			String a=null;
			b[0]=1;
			b[1]=2;
			b[2]=9;
			if(a.equals("swetha"))
			{
				
			}
			//b[3]=s.nextInt();
			//int i=s.nextInt();
			String name="swetha";
			System.out.println(name.charAt(6));
			int c=1/0;
		}
		catch(ArrayIndexOutOfBoundsException p)
		{
			System.out.println("ArrayIndexoutofboundexception");
		}
		catch(InputMismatchException m)
		{
			System.out.println("InputMismatch");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic");
		}
		catch(NullPointerException n)
		{
			System.out.println("Null pointer exception");
		}
		catch(StringIndexOutOfBoundsException ss)
		{
			System.out.println("Stringindexoutofbound exception");
		}
		finally
		{
			System.out.println("Finally block");
		}
		

	}

}
