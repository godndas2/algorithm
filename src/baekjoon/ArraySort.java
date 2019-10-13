package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2750
public class ArraySort {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    System.out.println("num : " + num);
    int[] a = new int[num];
System.out.println("a" + Arrays.toString(a));

    for (int i = 0; i < num; i++) {
        int tmp = sc.nextInt();
    }
        Arrays.sort(a); // ASC
        for (int x : a) {
            System.out.println("x" + x);
        }
   }
}
