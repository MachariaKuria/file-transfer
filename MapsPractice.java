package collections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapsPractice {

	public static void main(String[] args) {
		
		Map<String, BigDecimal> items = new HashMap<String, BigDecimal>();
		
		items.put("Toyota",new BigDecimal("19999.99"));
		items.put("Honda",new BigDecimal("23999.89"));
		items.put("Mercedes",new BigDecimal("499999.76"));
		items.put("BMW",new BigDecimal("399999.89"));
		items.put("Ford",new BigDecimal("15999.35"));
		
		System.out.println("The price of a Mercedes is: "+ items.get("BMW"));
		
	}

}
