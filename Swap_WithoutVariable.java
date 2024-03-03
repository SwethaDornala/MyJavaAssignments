package AssignmentsOfJava;

import java.util.Scanner;

public class Swap_WithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        int b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
       
	}

}
