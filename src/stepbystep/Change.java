package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/change/change.php?pname=change
public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
// PLAN B
//	 int price=0; 
//     int x,y,z=0; 
//     Scanner input=new Scanner(System.in); 
//     System.out.print("물건의 값을 입력하세요:"); 
//     price=input.nextInt(); 
//      
//     System.out.println("1000원을 지불하였습니다."); 
//     x=(1000-price)/100; 
//     y=(1000-price-100*x)/50; 
//     z=(1000-price-100*x-50*y)/10; 
//     System.out.print("거스름돈은 100원짜리"+x+"개, 50원짜리"+y+"개, 10원짜리"+z+"개 입니다."); 
}
