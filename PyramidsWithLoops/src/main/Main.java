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
		int k = 5; // setting line numbers
		int no_Line = k; // declaring line number variable
		
		for (int i = 0; i < k; i++) // loop for pyramid
		{
			for (int j = k-i; j > 1; j--) 
			{
				System.out.print(" "); //loop for spaces to left of pyramid
			}
			
			no_Line = i + 1; //adding layer to pyramid 
			
			System.out.print(no_Line); //allows first line to be just "1" instead of "11"
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(no_Line + ""+  no_Line); //prints line with added increment
			}
			
			System.out.println(" "); // goes to next line
		}
	}		
}
