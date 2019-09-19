/*
 * Tom Slayton
 * slaytotd@mail.uc.edu
 * IS4010 App Dev with Java
 * Fall 2019
 * Pyramid built with loops
 * 
 * 
 * 
*/
package main;

public class Main
{
	public static void main(String[] args) 
	{
		int lines = 5; // setting line numbers
		
		int k = lines; // declaring line number variable
		
		for (int i = 0; i < lines; i++) // loop for pyramid
		{
			for (int j = lines-i; j > 1; j--) 
			{
				System.out.print(" "); //loop for spaces to left of pyramid, i.e. 4 spaces before line 1, 3 spaces before line 2
			}
			
			k = i + 1; //adding first layer to pyramid 
			
			System.out.print(k); // first line just "1" instead of "11"
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(k + ""+  k); //prints line with added increment
			}
			
			System.out.println(""); // goes to next line
		}
	}		
}
