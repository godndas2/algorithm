package baekjoon.step;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2577
public class BOJ2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());
        int c = Integer.parseInt(sc.nextLine().trim());

        int result = a * b * c;
        int arr[] = new int[10];

        while (result != 0) {
            int value = result % 10;
            arr[value]++;

            result /= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
