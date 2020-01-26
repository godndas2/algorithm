package baekjoon.step;

import java.io.*;

// https://www.acmicpc.net/problem/3052
public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isDupl = new boolean[42];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            if (!isDupl[a % 42]) {
                isDupl[a % 42] = true;
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
