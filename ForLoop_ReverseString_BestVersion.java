package basicjavaprogram;
//Assignment 71: WAP to reverse a string

public class ForLoop_ReverseString_BestVersion {

	public static void main(String[] args) {
	
		String input = "mouse";
		String output = "";
		
		for (int i=input.length()-1; i>=0; i--) //best way
	  //for (int i=4; i>=0; i--) //Loop from last index (4) to first (0) - This will also work
		
		{
			char a = input.charAt(i);
			output = output+a;
		}

		System.out.println("The reversed output of the given input is: "+output);
	}

}
