package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2750
public class ArrayListSort {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
        int temp  = sc.nextInt();
        a.add(temp);
    }
        Collections.sort(a);
    for (int x : a) {
        System.out.println(x);
    }
  }
}
