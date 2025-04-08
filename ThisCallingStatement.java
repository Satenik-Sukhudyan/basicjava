package basicjavaprogram;

// Assignment 45: WAP on this calling statement


public class ThisCallingStatement 
{
    //Constructor 1: takes an int parameter
	ThisCallingStatement(int a)
	{
		
		System.out.println("Constructor 1");
	}
	
	//Constructor 2: takes an int and double as parameters
    ThisCallingStatement(int a, double c)	
	{
    	this (11);// Calls constructor 1
    	System.out.println("Constructor 2");
	}
	
	
	//Constructor 3: no-argument constructor 
    ThisCallingStatement()
	{
    	this (4, 5.2);  // Calls constructor 2 
    	System.out.println("Constructor 3");
	}
	
	
	
	public static void main(String[] args){
		new ThisCallingStatement(); 
//Execution starts with constructor 3 (no argument constructor) for which I created an object
		

	}

}
