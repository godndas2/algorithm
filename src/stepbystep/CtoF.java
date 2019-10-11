package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/CtoF/CtoF.php?pname=CtoF
public class CtoF {

	public static void main(String[] args) {
		int num = 0; // temp
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		float tempF = 0;
		tempF = (float) (9.0 / 5.0 * num + 32);
		System.out.println(tempF);
	}

}
