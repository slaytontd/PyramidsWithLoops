/*
 * 
 * Assignment 04
 * Tom Slayton
 * Description: Pyramid built with loops
 * Due Date: 9/26/19 8:00 AM
 * IS4010 App Dev with Java
 * mail: slaytotd@mail.uc.edu
 * 
*/
package main;
public class Main
{
	public static void main(String[] args) 
	{
			int lines = 5; //defining size of pyramid 
			int k = lines;
			
			for (int i = 0; i < lines; i++) //loop for pyramid
			{
				for (int j = lines - i; j > 1; j--) //white spaces to right of numbers 
				{
					System.out.print(" ");
				}
			
				k = i + 1;
				System.out.print(k); // prints first numbers on left of layers 
				
				for (int j = 1; j <=i; j++)
				{
					System.out.print(k + ""+ k); //adds numbers to layer after first number
				}
				
				System.out.println(""); //moves to next line
				
		}
	}		
}

