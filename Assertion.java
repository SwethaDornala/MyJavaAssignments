package Stringfunctions;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		assert a.length()>2 : "Oh my God! U r string length is less than 2";
		System.out.println(a);

	}

}
