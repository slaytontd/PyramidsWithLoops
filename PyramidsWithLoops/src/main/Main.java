/*
 * Tom Slayton
 * slaytotd@mail.uc.edu
 * IS4010 App Dev with Java
 * Fall 2019
 * Pyramid built with loops increasing in number
 * 
 * 
*/
package main;

public class Main
{
	public static void main(String[] args) 
	{
		int l = 5; // setting line numbers
		int newLine = l; // declaring line number variable
		
		for (int i = 0; i < l; i++) // loop for pyramid
		{
			for (int j = l-i; j > 1; j--) 
			{
				System.out.print(" "); //loop for spaces to left of pyramid
			}
			
			newLine = i + 1; //adding layer to pyramid 
			
			System.out.print(newLine); //allows first line to be just "1" instead of "11"
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(newLine + ""+  newLine); //prints line with added increment
			}
			
			System.out.println(" "); // goes to next line
		}
	}		
}
