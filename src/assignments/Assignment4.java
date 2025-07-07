package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Assignment4 {
	
/*1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
	cities combined.*/
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1484);
		numbers.add(714);
		numbers.add(650);
		numbers.add(640);
		numbers.add(631);
		int add = numbers.get(2) + numbers.get(3);
		System.out.println("Total area of cities combined is :" +add);

/*2. Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size.*/
		
		HashSet<String> topCities = new HashSet<String>();
		topCities.add("Tokyo");
		topCities.add("Paris");
		topCities.add("Bali");
		topCities.add("New York City");
		topCities.add("Rome");
		topCities.add("Cape Town");
		topCities.add("Sydney");
		topCities.add("Santorini");
		topCities.add("Kyoto");
		topCities.add("Queenstown");
		System.out.println(topCities);
		System.out.println("Size:" +topCities.size());
		
/*	3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
		6th Value.	*/
		
		int [] numbers1 = new int[] {123,234,345,456,567,678,789,890,901,102};
		float average1;
		average1 = numbers1[4]+numbers1[5]/2;
		System.out.println(average1);
		
/*		4. Create a list of the top 5 highest-grossing movies of all time and print out the third
		movie on the list.	*/	
		ArrayList <String> movieNames = new ArrayList<>();
		movieNames.add("Avatar");
		movieNames.add("Avengers: Endgame ");
		movieNames.add("Avatar: The Way of Water");
		movieNames.add("Titanic");
		movieNames.add("Star Wars: The Force Awakens");
		System.out.println("the third movie on the list :"+ movieNames.get(2));
	}

}
