package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/fuse/fuse.php?pname=fuse
public class Fuse {

	public static void main(String[] args) {
		int a,b,c = 0;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		double comp = a * 2.5;
		double print = b * 2.0;
		double router = c * 0.5;
		double fuseTotal = (comp + print + router)*2;
		
		int fuse = (int) (fuseTotal / 10 + 1);
		int fuseAnswer = fuse * 10;
		System.out.println(fuseAnswer);
		
	}

}
