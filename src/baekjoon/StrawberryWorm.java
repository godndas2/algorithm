package baekjoon;

import java.util.Scanner;

/**
 * @author HalfDev
 * https://www.acmicpc.net/problem/2560
 * Â¤½Å¹ú·¹
 */
public class StrawberryWorm {
	
	static int[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int die = sc.nextInt();
		int num = sc.nextInt();
		dp = new int[num + 1];
		dp[0] = 1;
		
		for (int i = 1; i < dp.length; i++) {
			if (i < start) {
				dp[i] = dp[i - 1] % 1000;
			} else if (i < end){
				dp[i] = (dp[i-1] + dp[i - start] % 1000);
			} else {
				dp[i] = (dp[i-1] + dp[i - start] - dp[i - end] + 1000) % 1000;
			}
			
			if (num - die >= 0 ) {
				System.out.println((dp[num] - dp[num - die] + 1000) % 1000);
			} else {
				System.out.println(dp[num] % 1000);
			}
		}
	}

}
