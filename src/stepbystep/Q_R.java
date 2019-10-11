package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/q_r/q_r.php?pname=q_r
public class Q_R {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		int numA = a / b;
		int numB = a % b;
		System.out.println(numA+"\t"+numB);
	}

}
