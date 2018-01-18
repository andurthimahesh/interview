package com.interview.programs;

public class Swap {
	public void swapping(int firstNumber,int lastNumber)
	{
		/* int temp; 
		 temp = firstNumber; 
		 firstNumber = lastNumber;
		 firstNumber=20;
		 lastNumber = temp;*/
		
		firstNumber = firstNumber + lastNumber;
		lastNumber = firstNumber - lastNumber;
		firstNumber = firstNumber - lastNumber;
		 System.out.println(firstNumber+" "+lastNumber);
		
	}

	public static void main(String[] args) {
		int firstNumber = 10;
		int lastNumber = 20;
		Swap swap= new Swap();
		swap.swapping(firstNumber, lastNumber);
		

		


	}

}
