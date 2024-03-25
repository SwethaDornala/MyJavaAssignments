package Collection;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add('d');
		h.add(null);
		h.add(10);
		h.add(90);
		h.add(50);
		//Collections.sort(h);
		System.out.println(h);

	}

}
