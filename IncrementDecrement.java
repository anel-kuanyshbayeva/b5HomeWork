package Operators;

public class IncrementDecrement {
	
	public static void main (String [] args) {
		
		int num1 = 16;
		int num2 = 22;
				//	16   +    23    +  23    +   21   +   18  +  18 = 
		int total = num1++ + ++num2 + num2-- + --num2 + ++num1 + num1++;

		System.out.println (num1);
		System.out.println (num2);
		
		System.out.println (total);
		
		
		
	}
	

}
