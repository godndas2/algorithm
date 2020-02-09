package baekjoon.step;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2292
public class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 1;
        int rN = 1;
        int addN = 6;

        while (true) {
            if (n <= rN) {
                break;
            }

            rN += addN;
            addN += 6;
            result++;
        }
        System.out.println(result);
    }

}
