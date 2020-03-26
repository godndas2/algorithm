package baekjoon.step;

import java.io.*;

// https://www.acmicpc.net/problem/10872
public class BOJ10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = 1;

        // 0!은 1이다.
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
        }
        bw.write(String.valueOf(result));
        System.out.println((result));
        bw.close();
    }
}
