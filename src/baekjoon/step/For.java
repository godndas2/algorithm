package baekjoon.step;

import java.io.*;
import java.util.StringTokenizer;
// https://www.acmicpc.net/problem/15552
public class For {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer t;

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            t = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(t.nextToken());
            int b = Integer.parseInt(t.nextToken());
            int sum = a+b;

            bw.write(sum + "\n");
        }
        bw.flush();




    }

}

