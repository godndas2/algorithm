package baekjoon.step;

import java.io.IOException;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2839
public class BOJ2839 {
    public static int nThree;
    public static int answer;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n % 5 != 0 && n >= 0) {
            n -= 3;
            ++nThree;
        }

        answer = n < 0 ? -1 : nThree + n/5;

        System.out.println(answer);
    }
}
