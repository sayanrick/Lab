package Lab_Session_12th_Aug;

import java.util.LinkedList;

public class LinkedListReplace {
	public static void main(String ...args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(33);
		ll.add(22);
		ll.add(55);
		// before replacing element
		System.out.println(ll);
		ll.remove(); // this method will remove the first element 
		// after replacing element
		System.out.println(ll);
	}


}
