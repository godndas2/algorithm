package baekjoon.step;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2908
public class BOJ2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = reverse(a);
        b = reverse(b);

        System.out.println(a>b?a:b);

    }

    public static int reverse(int reverse) {
        String out = "";
        while (reverse != 0) {
            out += (reverse%10);
            reverse = reverse/10;
        }

        return Integer.parseInt(out);
    }
}

