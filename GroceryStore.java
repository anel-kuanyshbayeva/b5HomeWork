package Operators;

	import  java.util.Scanner;
	
	public class GroceryStore {
		
		public static void main (String [] args) {
			
			Scanner input = new Scanner (System.in);
			
			System.out.println ("Enter price of oranges?");
			
			int price = input.nextInt();
			
			System.out.println ("Enter how many pounds you want?");
			
			int pound = input.nextInt();
			
			double sum = price*pound;
			
			System.out.println ("What is your account balance?");
			
			int account = input.nextInt ();
			
			boolean purchase;
			
			purchase = account >=sum;
				
			System.out.println ("You can make a purchase: " +purchase);
			
			
			
		}
	
	

}
