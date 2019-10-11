package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author HalfDev
 * https://www.acmicpc.net/problem/6588
 * ∞ÒµÂπŸ»Â¿« √ﬂ√¯
 */
public class Goldbach {

	public static int MAX = 10000;
	public static boolean[] nPrimeNum;
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		nPrimeNum = new boolean[MAX+1];
		// method call
		getPrimeNum();
		
		int size = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < size; i++) {
			int num = Integer.parseInt(br.readLine());
			
			for (int j = num/2; j > 0; j--) {
				int index = i;
				int index2 = num - i;
				if (!nPrimeNum[index] && !nPrimeNum[index2]) {
					sb.append(index + " " + index2 + "\n");
					break;
					
				}
			}
		}
		System.out.println(sb.toString());
	}
	
	public static void getPrimeNum() {
		nPrimeNum[1] = true;
		
		for (int i = 2; i < MAX; i++) {
			for (int j = 2; i*j <= MAX; j++) {
				nPrimeNum[i*j] = true;
			}
			
		}
	}

}
