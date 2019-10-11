package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/swap/swap.php?pname=swap
public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a; int b; int c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a; 
		a = b; 
		b = c;
		
		System.out.println("a: "+ a + " b: " + b);
	}

}
