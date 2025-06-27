package assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Assignment_ArraysCollections {

	public static void main(String[] args) {
		
		
		//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		//List is allow null  and  duplicate values
		ArrayList<String> largestcities = new ArrayList<String> ();
		largestcities.add("Delhi");
		largestcities.add("Bangalore");
		largestcities.add("Hyderabad");
		largestcities.add("Mumbai");
		largestcities.add("Chennai");
		System.out.println("***************** ArrayList ***********");
		System.out.println("Larget cities 3rd " + largestcities.get(2) + " and Larget cities 4th " + largestcities.get(3));

		//Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		//Set allow one null value, and duplicate values are not 
		Set<String> touristplace = new HashSet<String>();
		touristplace.add("Varanasi");
		touristplace.add("Taj Mahal");
		touristplace.add("Eiffel Tower");
		touristplace.add("colosseum");
		touristplace.add("Eiffel Tower");
		touristplace.add("Grand Canyon");
		touristplace.add("Sagrada Familia");
		touristplace.add("Great Wall of China");
		touristplace.add("Istanbul");
		touristplace.add("Niagara Falls");
		System.out.println("**********************Set*****************");
		System.out.println("Size of the set values "+ touristplace.size());

		//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		LinkedList<String> movies = new LinkedList<String>() ;
		movies.add("Baahubali 2");
		movies.add("RRR");
		movies.add("Kalki 2898 AD");
		movies.add("Salaar: Part 1 – Ceasefire");
		movies.add("Pushpa 2");
		System.out.println("***************** LinkedList ***********");
		System.out.println("Highest grossing movies of all time 3rd movies name is "+ movies.get(2));


		//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		int[] numbers = {12, 25, 37, 48, 59, 61, 72, 83, 94, 105};
		int fifth_value=numbers[4];
		int sixth_value = numbers[5];
		int average =(fifth_value+sixth_value)/2;
		System.out.println("************** Arrays Average values******************");
		System.out.println("Average of 5th and 6th Value is a " + average);



	}

}
