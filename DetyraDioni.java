import java.util.Scanner;
public class DetyraDioni {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Bob's money: ");
		int x = scan.nextInt(); // Amount of money Bob has
		while(x < 1 || x > 10){
			System.out.println("Bob's amount of money should be between 1 and 10 !!");
			System.out.print("Bob's money: ");
			x = scan.nextInt();
		}
		System.out.print("Price of 1 kg apples: ");
		int a = scan.nextInt(); // Cost per kg of apples
		while(a < 1 || a > 10){
			System.out.println("Price of apples can't be higher than 10 or less than 1 !!");
			System.out.print("Price of 1 kg apples: ");
			a = scan.nextInt();
		}
		System.out.print("Price of 1 kg oranges: ");
		int b = scan.nextInt(); // Cost per kg of oranges
		while(b < 1 || b > 10){
			System.out.println("Price of oranges can't be higher than 10 or less than 1 !!");
			System.out.print("Price of 1 kg oranges: ");
			b = scan.nextInt();
		}
		System.out.println("--------------------------------");
		System.out.println(x); // Printing amount of money Bob has
		System.out.println(a+" "+b); // Printing prices of apples and oranges
		int price = a + b; // Price of 1 kg apple and orange
		if(x >= price){ 
			System.out.println("Yes"); // if Bob's amount of money is equal or higher than price of 1 kg apple and orange we print Yes
		}else{
			System.out.println("No");
		}
	}
}
