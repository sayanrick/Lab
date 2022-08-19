package Lab_Session_18th_Aug_assingment1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	private ArrayList<Integer> a1 = new ArrayList<>();
	private List<Integer> a2 = new ArrayList<>();
	public ArrayList<Integer> storeEvenNumbers(int N) {
			a1.add(N);
		return a1;
		
	}
	
	public List<Integer> printEvenNumbers(){
		a2 = a1.stream().sorted().map(N-> N*2).collect(Collectors.toList());
		return a2;
	}
	
	public int retrieveEvenNumber(int N) {
		if(a1.contains(N))
			return N;
		else return 0;
	}
	public static void main(String ...args) {
		EvenNumber e = new EvenNumber();
		e.storeEvenNumbers(12);
		e.storeEvenNumbers(22);
		e.storeEvenNumbers(44);
		e.storeEvenNumbers(74);
		e.storeEvenNumbers(100);
		e.storeEvenNumbers(222);
		System.out.println(e.storeEvenNumbers(112));
		System.out.println(e.printEvenNumbers());
		System.out.println(e.retrieveEvenNumber(75));

		
	}

}
