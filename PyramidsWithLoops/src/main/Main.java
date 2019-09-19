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
		int line_no = k; // declaring line number variable
		
		for (int i = 0; i < k; i++) // loop for pyramid
		{
			for (int j = k-i; j > 1; j--) 
			{
				System.out.print(" "); //loop for spaces to left of pyramid
			}
			
			line_no = i + 1; //adding layer to pyramid 
			
			System.out.print(line_no); //allows first line to be just "1" instead of "11"
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(line_no + ""+  line_no); //prints line with added increment
			}
			
			System.out.println(""); // goes to next line
		}
	}		
}
