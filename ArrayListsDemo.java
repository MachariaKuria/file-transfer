package collections;

import java.util.ArrayList;

public class ArrayListsDemo {

	public static void main(String[] args) {
		ArrayList<String> planets = new ArrayList<String>();
		planets.add(0,"Sun");
		planets.add("Mercury");
		planets.add("Venus");
		planets.add("Earth");
		planets.add("Mars");
		planets.add("Jupiter");
		planets.add("Saturn");
		planets.add("Uranus");
		planets.add("Neptune");
		planets.add("Pluto");
		
		System.out.println("Below you'll find the " + planets.size()+ " bodies in our Solar System:");
		for(String planet: planets) {
			System.out.println(planet);
		}
		planets.set(9,"Kipper Belt");
		System.out.println();
		System.out.println("Some notes about our Solar System:");
		System.out.println();
		System.out.println("1. The " + planets.get(0) + " is the only Star in our Solar System.");
		System.out.println("2. The sixth planet in our Solar System is "+ planets.get(5));
		System.out.println("3. Our Solar System has only one know dwarf planet called "+planets.get(8));
		System.out.println("4. There is a region of Solar System's debri found between "+planets.get(8) + " and Pluto called the "+planets.get(9));
		System.out.println();
		planets.remove("Earth");
		boolean ans = planets.contains("Earth");
		if(ans) {
			
		System.out.println("Our planet is called Earth");
		}
		else {
			System.out.println("Oops! Our planet is absent from the List because we removed it.");
		}
	}
}

