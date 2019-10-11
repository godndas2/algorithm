package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/three/three.php?pname=three
public class Three {

	public static void main(String[] args) {
		int numA, numB = 0;
		Scanner sc = new Scanner(System.in);
		numA = sc.nextInt();
		numB = sc.nextInt();
		
		int a = numB / 100;
		int b = (numB % 100) / 10; 
		int c = (numB % 100) % 10;
		int rsltA = numA * c;
		int rsltB = numA * b;
		int rsltC = numA * a;
		System.out.println(rsltA);
		System.out.println(rsltB);
		System.out.println(rsltC);
		System.out.println(numA * numB);
		
	}
}
