package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/business/business.php?pname=business
public class Business {

	static class businessTest{
		int n,m,p,c = 0;  		// 원가, 정가, 위조금액, 거스름돈
		int pay, money, profit;
		
		public businessTest() {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			m = sc.nextInt();
			p = sc.nextInt();
			c = sc.nextInt();
		}
		public void getPay() { this.pay = (m + c) - p; } 
		public void getMoney() { money = pay - c; } 
		public void getProfit() {
			this.profit = n - money; 
			System.out.println(profit);
		}
		
	}
	
	public static void main(String[] args) {
		businessTest b = new businessTest();
		b.getPay();
		b.getMoney();
		b.getProfit();
		
	}

}
