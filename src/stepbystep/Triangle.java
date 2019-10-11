package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/triangle/triangle.php?pname=triangle
public class Triangle {

	public static void main(String[] args) {
		int a;
		int b;
		double tmp;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		tmp = a * b / 2.0;
		System.out.printf("%.2f\n", tmp);
	}

}
