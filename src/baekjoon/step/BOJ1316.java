package baekjoon.step;

import java.io.IOException;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1316
public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while (n-->0) {
            String s = sc.next();
            int[] arr = new int[26];
            cnt ++;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i-1)) {
                    arr[s.charAt(i-1)-97] = -1;
                    if (arr[s.charAt(i)-97] == -1) {
                        cnt--;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
