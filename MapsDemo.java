package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<String,String> countries = new HashMap<String,String>();
		countries.put("Nairobi","Kenya");
		countries.put("Dodoma","Tanzania");
		countries.put("Addis Ababa","Ethiopia");
		countries.put("Kigali","Rwanda");
		countries.put("Mogadishu","Somalia");
		
		System.out.println("The list of countries is :\n" +countries);

		Set<String> countryIds = countries.keySet();
		System.out.println("The country IDs are "+ countryIds);
		
		Collection<String> countryNames = countries.values();
		System.out.println("The country names are "+countryNames);
		
		for(Entry<String, String>entry : countries.entrySet()) {
			System.out.println("The country's ID is " + entry.getKey());
			System.out.println("The country's name is "+entry.getValue());
		}
	}

}
