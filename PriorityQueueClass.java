package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PriorityQueue p=new PriorityQueue();
      p.add(10);
		//p.add("swetha");
		//p.add(10);
		//p.add('a');
		//p.add(null);
      p.add(5);
      p.add(89);
      p.add(10);
      p.add(4);
      p.add(23);
      p.add(68);
      //p.add('d');
      
		PriorityQueue p1=new PriorityQueue();
		//p1.add(null);
		//v1.add("swetha");
		p1.add("swetha");
		System.out.println(p);
		//Collections.sort(p);
		System.out.println(p1);
	}

}
