package com.assignments;

import java.util.*;

public class Assignment5 {

	public static void main(String[] args) {
		
		/*
		 * 1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		 */
		
		List<String> worldsMostPopulatedCountriesArrayList = new ArrayList<String>();
		
		worldsMostPopulatedCountriesArrayList.add("India");
		worldsMostPopulatedCountriesArrayList.add("China");
		worldsMostPopulatedCountriesArrayList.add("United states");
		worldsMostPopulatedCountriesArrayList.add("Indoneshiya");
		worldsMostPopulatedCountriesArrayList.add("Pakistan");
		
		//System.out.println("List of the top 5 most populated countries in the world : " +worldsMostPopulatedCountriesArrayList);
		System.out.println("1. 2nd country : "+worldsMostPopulatedCountriesArrayList.get(1));
	    System.out.println();
		
//		2. Create a set of the top 10 most visited tourist attractions in the world and print out its
//		size.
		
		Set<String> touristAttractionHashSet = new HashSet<String>();
		
		touristAttractionHashSet.add("Eiffel Tower");
		touristAttractionHashSet.add("Taj Mahal");
		touristAttractionHashSet.add("Great Wall of China");
		touristAttractionHashSet.add("Colosseum");
		touristAttractionHashSet.add("Louvre Museum");
		touristAttractionHashSet.add("Times Square");
		touristAttractionHashSet.add("Las Vegas Strip");
		touristAttractionHashSet.add("Christ the Redeemer");
		touristAttractionHashSet.add("Sagrada Familia");
        touristAttractionHashSet.add("Gardens by the Bay");
        
      //  System.out.println("set of the top 10 most visited tourist attractions in the world : "+touristAttractionHashSet);
        System.out.println("2.Size of most visited tourist attractions in the world : "+touristAttractionHashSet.size());
        System.out.println();
        
       // 3. Create a map of the 5 largest cities in the United States and their populations.
        
        Map<String,String> largestCitiesHashMap = new HashMap<String,String>();
        
        largestCitiesHashMap.put("abc","9000");
        largestCitiesHashMap.put("rty","987");
        largestCitiesHashMap.put("kjh","876");
        largestCitiesHashMap.put("qwe","888");
        largestCitiesHashMap.put("asd","777");
        
        System.out.println("3.Map of the 5 largest cities in the United States and their populations : "+largestCitiesHashMap);
        System.out.println();
        
      //  4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
        int [] integersNumbers = {1,3,4,6,7,2,5,9,8,43};
        
        int sum = integersNumbers[2] + integersNumbers[4];
        
        System.out.println("4.Sum of 3rd and 5th Value : "+sum);
        System.out.println();
        
        // 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
        //on the list.
		
        List<String> highGrosserArrayList = new ArrayList<String>();
        
        highGrosserArrayList.add("Bahubali");
        highGrosserArrayList.add("Animal");
        highGrosserArrayList.add("Gadar");
        highGrosserArrayList.add("PK");
        highGrosserArrayList.add("Dangal");
        
        System.out.println("5. print out the third movie : "+highGrosserArrayList.get(2));
		
		
		
	}

}
