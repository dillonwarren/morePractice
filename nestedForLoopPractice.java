package helloWorld;

public class nestedForLoopPractice {

	public static void main(String[] args) {
		 int weeks = 3;
		    int days = 7;

		    // outer loop prints weeks
		    for (int i = 1; i <= weeks; ++i) {
		      System.out.println("Week: " + i);

		      // inner loop prints days
		      for (int j = 1; j <= days; ++j) {
		        System.out.println("  Day: " + j);
		      }
		    }
		    
		    int rows = 5;

		    // outer loop
		    for (int i = 1; i <= rows; ++i) {

		      // inner loop to print the numbers
		      for (int j = 1; j <= i; ++j) {
		        System.out.print(j + " ");
		      }
		      System.out.println("");
		    }
		  }
	
	

	}


