package baekjoon.step;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1712
public class BOJ1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer t = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(t.nextToken());
        long b = Integer.parseInt(t.nextToken());
        long c = Integer.parseInt(t.nextToken());

        if ((c - b) > 0) {
            bw.write(((a / (c-b)) + 1) + "\n");
        } else {
            bw.write("-1\n");
        }

        bw.flush();
        br.close();
        bw.close();


    }
}
