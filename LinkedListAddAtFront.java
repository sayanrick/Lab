package Lab_Session_12th_Aug;

import java.util.LinkedList;

public class LinkedListAddAtFront {
	public static void main(String ...args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(33);
		ll.add(22);
		ll.add(55);
		// before adding element at front
		System.out.println(ll);
		ll.addFirst(1000); // adding an element(1000) in front of the linked list
		// after adding element at front
		System.out.println(ll);
	}

}
