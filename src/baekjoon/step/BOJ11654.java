package baekjoon.step;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11654
public class BOJ11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ascii = sc.next();
        int result = ascii.charAt(0);

        System.out.println(result);

        sc.close();
    }
}
