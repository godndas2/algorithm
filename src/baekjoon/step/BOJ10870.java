package baekjoon.step;

import java.io.*;

// https://www.acmicpc.net/problem/10870
public class BOJ10870 {
    /*
    *  Fn = Fn-1 + Fn-2
    * */
    public static int getFibo(int n) {
        if (n <= 1) return n;
        else return getFibo(n - 1) + getFibo(n - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write(num);
        br.close();

        System.out.println(getFibo(num));
    }
}
