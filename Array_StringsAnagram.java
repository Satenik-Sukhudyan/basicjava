//Assignment 83: WAP to find out if the given 2 strings are anagram         

package basicjavaprogram;

import java.util.Arrays;

public class Array_StringsAnagram {

	public static void main(String[] args) {
		
		String a = "satenik";
		String b = "intakes";
		if (a.length() != b.length ())
			
		{
			System.out.println("The given strings are not anagram");
		}
		
		else
		
		{
			System.out.println("The length of these 2 strings are same");
			char c1[] = a.toCharArray();
			char c2[] = b.toCharArray();
			System.out.println("Before Sorting c1 is: "+Arrays.toString(c1));
			System.out.println("Before Sorting c2 is: "+Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After Sorting c1 is: "+Arrays.toString(c1));
			System.out.println("After Sorting c2 is: "+Arrays.toString(c2));
			
			
			boolean b1 = Arrays.equals(c1,c2);
		
		    if(b1==true)
		    {
		    	System.out.println("The given strings are anagram");
		    }
		    else
		    {
		    	System.out.println("The given strings are not anagram");
		    }	
			
		}	
	}

}
