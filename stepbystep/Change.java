package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/change/change.php?pname=change
public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 1000;
		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		int d = 0;
		
		a = 1000 - a;
		
		if (a > 100) {
			b = a / 100;
			a = a % 100;
		}
		if (a > 50) {
			c = a / 50;
			a = a % 50;
		}
		if (a > 10) {
			d = a / 10;
			a = a % 10;
		}
		/*
	    4, 70
		1, 20
		2, 0
		*/
		System.out.printf("%d, %d, %d", b, c, d);
		
	}

}
