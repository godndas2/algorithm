package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/op/op.php?pname=op
public class Op {

	public void opCalc() {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}
	
	public static void main(String[] args) {
		
		Op op = new Op();
		op.opCalc();
	}

}

// PLAN B

//public class Op {
//
//	public static void main(String[] args) {
//		String[] key = {"+","-","*","/","%"};
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		for (String str : key) {
//			switch (str) {
//			case "+": c = a+b;
//				break;
//			
//			case "-": c = a-b;
//			break;
//			
//			case "*": c = a*b;
//			break;
//			
//			case "/": c = a/b;
//			break;
//			
//			case "%": c = a%b;
//			break;
//			
//			default: c = 0;
//			break;
//			}
//			System.out.printf("\n%d %s %d = %d\n  ", a, str, b, c); 
//		}
//	}
//
//}

