package Collection;

import java.util.Collections;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(10);
		v.add("swetha");
		v.add(10);
		v.add(null);
		Vector v1=new Vector();
		v1.add(30);
		v1.add(20);
		System.out.println(v);
		Collections.sort(v1);
		System.out.println(v1);
		// TODO Auto-generated method stub

	}

}
