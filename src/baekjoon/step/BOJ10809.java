package baekjoon.step;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10809
public class BOJ10809 {
    public static void main(String[] args) {
        // indexOf : 문자열 위치 반환
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(a.indexOf(c) + " ");
        }
        sc.close();
    }
}
