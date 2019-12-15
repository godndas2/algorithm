package baekjoon.step;

import java.io.*;
import java.util.StringTokenizer;

/**
* @author halfdev
* @since 2019-12-15
* https://www.acmicpc.net/problem/10818
 *
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/
public class MinMax {

    public static void main(String[] args) throws IOException { // IOException으로 예외 처리는 필수

        // readLine()시 리턴값이 String으로 고정되기에 String이 아닌 다른타입으로 입력을 받으려면 형변환을 꼭 해주어야한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int arr[] = new int[num];

        // readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // i 만큼 돌면서 순서대로 호출
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(min + " " + max);
        bw.flush(); // 남은 Data 모두 출력
        bw.close();
    }
}
