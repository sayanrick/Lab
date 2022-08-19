package Lab_Session_18th_Aug_assingment1;

import java.util.HashSet;

public class Country {
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> storeCountryNames(String S){
		H1.add(S);
		return H1;
	}
	
	public String retrieveCountry(String S) {
		if(H1.contains(S))
			return S;
		else return null;
	}
	
	
	
	
	public static void main(String ...args) {
		
	}

}
