package baekjoon.step;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2675
public class BOJ2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = sc.nextInt();
            String str = sc.nextLine();

            String result = "";
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < count; k++) {
                    result += str.charAt(j);
                }
            }
            result = result.replaceAll(" ","");
            System.out.println(result);
        }
        sc.close();
    }
}
