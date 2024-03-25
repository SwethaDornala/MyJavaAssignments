package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList v=new LinkedList();
		v.add(10);
		v.add("swetha");
		v.add(10);
		v.add(null);
		LinkedList v1=new LinkedList();
		v1.add(30);
		//v1.add("swetha");
		v1.add(20);
		System.out.println(v);
		Collections.sort(v1);
		System.out.println(v1);
	}

}
