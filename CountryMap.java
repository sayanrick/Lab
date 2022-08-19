package Lab_Session_18th_Aug_assingment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryMap {
	HashMap<String, String> M1 = new HashMap<>();
	HashMap<String, String> M2 = new HashMap<>();
	
	public HashMap<String, String> storeCountryCapital(String countryName, String capital) {
		M1.put(countryName, capital);
		return M1;
	}
	
	public String retrieveCapital(String countryName) {
		return M1.get(countryName);
	}
	
	public HashMap<String, String> method1() {
		for (Map.Entry<String, String> entry : M1.entrySet()) {
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}
	
	public ArrayList<String> HashMapToArrayList(){
		ArrayList<String> l = new ArrayList<String>(M2.values());
		return l;
	}
	
	public static void main(String ...args) {
		CountryMap C = new CountryMap();
		C.storeCountryCapital("India", "Delhi");
		System.out.println(C.storeCountryCapital("Japan", "Tokyo"));
		System.out.println(C.retrieveCapital("India"));
		System.out.println(C.method1());
		System.out.println(C.HashMapToArrayList());
		
	}
}
