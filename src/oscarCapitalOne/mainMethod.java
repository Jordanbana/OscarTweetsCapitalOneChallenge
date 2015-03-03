package oscarCapitalOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mainMethod {
	
	//creating counters to get the number of times each of these is mentioned
	//using this to come up with the 1-8 ranking
	int AmericanSniper = 0;
	int Birdman = 0;
	int Boyhood = 0;
	int GrandBudepest = 0;
	int ImitationGame = 0;
	int Selma = 0;
	int TheoryOfEverything = 0;
	int Whiplash = 0;
	
	String currentLine = "";
	
	void parseFile() throws FileNotFoundException{
	       Scanner scanner = new Scanner(new File("oscar_tweets.csv"));
	       
	        //Set the delimiter used in file
	        scanner.useDelimiter(",");
	         
	        //Get all tokens and store them in some data structure
	        //I am just printing them
	        while (scanner.hasNext())
	        {
	            //System.out.print(scanner.next() + "|");
	        	
	        	currentLine = scanner.nextLine();
	        	topMoviesInOrder();
	            
	            System.out.println(currentLine);
	            
	            if(currentLine.toLowerCase().contains("American Sniper".toLowerCase())) AmericanSniper++;
	            if(currentLine.toLowerCase().contains("Birdman".toLowerCase())) Birdman++;
	            if(currentLine.toLowerCase().contains("Boyhood".toLowerCase())) Boyhood++;
	            if(currentLine.toLowerCase().contains("Grand Budepest".toLowerCase())) GrandBudepest++;
	            if(currentLine.toLowerCase().contains("Imitation Game".toLowerCase())) ImitationGame++;
	            if(currentLine.toLowerCase().contains("Whiplash".toLowerCase())) Whiplash++;
	            if(currentLine.toLowerCase().contains("Selma".toLowerCase())) Selma++;
	            if(currentLine.toLowerCase().contains("Theory Of Everything".toLowerCase())) TheoryOfEverything++;
	            
	        }
	         
	        //Do not forget to close the scanner 
	        scanner.close();
	}
	
	void topMoviesInOrder(){
		System.out.println("THESE ARE THE STATS!");
		System.out.println(AmericanSniper);
		System.out.println(Birdman);
		System.out.println(Boyhood);
		System.out.println(GrandBudepest);
		System.out.println(ImitationGame);
		System.out.println(Selma);
		System.out.println(TheoryOfEverything);
		System.out.println(Whiplash);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mainMethod mainObject = new mainMethod();
		try {
			mainObject.parseFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//show me the top 8 movies 
		mainObject.topMoviesInOrder();

	}

}
