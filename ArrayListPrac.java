package helloWorld;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac {

	public static void main(String[] args) {
		
		
		ArrayList<String> dbzChars = new ArrayList<String>();
		dbzChars.add("Buu");
		dbzChars.add("Vegeta");
		dbzChars.add("Goku");
		dbzChars.add("Android18");
		
		Collections.sort(dbzChars);
		
		
		
		 for (int i = 0; i < dbzChars.size(); i++) {
		      System.out.println(dbzChars.get(i));
		    }
		 
		 System.out.println(" ");
		 
		 for (String i : dbzChars) {
		      System.out.println(i);
		    }
		 
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		 myNumbers.add(6);
		 myNumbers.add(7);
		 myNumbers.add(8);
		 
		 for(Integer i : myNumbers) {
			 
				System.out.print(i);
			}
		 }
		 

	}


