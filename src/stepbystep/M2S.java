package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/m2s/m2s.php?pname=m2s
public class M2S {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int tmp = num*60;
		System.out.println(num + " minute is " + tmp + " seconds.");
	}

}
