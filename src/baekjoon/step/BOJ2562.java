package baekjoon.step;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2562
public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int maxLocation = 0;

        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();
            if (max < n) {
                max = n;
                maxLocation = i;
            }
        }
        System.out.println(max);
        System.out.println(maxLocation);
    }
}
