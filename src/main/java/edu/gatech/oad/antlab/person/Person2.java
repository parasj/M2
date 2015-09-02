//package edu.gatech.oad.antlab.person;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
	  if (input == null) {
	  	return null;
	  }
	  ArrayList<Character> tempArray = new ArrayList<Character>();
	  for (char c : input.toCharArray()) {
		tempArray.add(c);
	  }
	  char[] finalArray = new char[tempArray.size()];
	  int counter = 0;
	  Random rand = new Random();
	  while(tempArray.size() != 0) {
    		int randomNum = rand.nextInt(tempArray.size());
    		finalArray[counter] = tempArray.get(randomNum);
    		tempArray.remove(randomNum);
    		counter++;
	  }
	  return new String(finalArray);
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

	// public static void main(String[] args) {
	//     Person2 me = new Person2("Rishav");
	//     for (int counter = 0; counter < 15; counter++ ) {
	//     	System.out.println(me.toString("1234567"));
	//     }
	// }
}
