package helloWorld;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPractice {

	public static void main(String[] args) {
	    try {
	        FileWriter myWriter = new FileWriter("filename.txt");
	        myWriter.write("Majin buu loves his chocolate!!!!!, Also goku throws mad energy blasts");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    }

	}


