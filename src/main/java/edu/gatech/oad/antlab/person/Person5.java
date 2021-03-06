package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  String[] letters = new String[input.length()];
	    int counter = 0;
	    while (counter < input.length()) {
	        letters[counter] = Character.toString(input.charAt(counter));
	        counter++;
	    }
	    String newInput = "";
	    int start = 2;
	    while (start < input.length()) {
	        newInput = newInput + letters[start];
	        start++;
	    }
	    newInput = newInput + letters[0] + letters[1];
	    return newInput;
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

}
