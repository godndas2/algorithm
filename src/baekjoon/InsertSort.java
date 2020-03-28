package baekjoon;

import java.io.*;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2750
public class InsertSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] arrNum = new int[n];

        for (int i = 0; i < n; i++) {
            arrNum[i] = Integer.parseInt(br.readLine()); // 수 입력 받아 배열에 저장
        }

        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            while (arrNum[i] > arrNum[i+1]) {
                temp = arrNum[i];
                arrNum[i] = arrNum[i+1];
                arrNum[i+1] = temp;
                if (i > 0) { // 정렬
                    i--;
                }
//                Arrays.sort(arrNum); 위의 if 와 동일
            }
        }
        getData(arrNum);
   }

   private static void getData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
   }
}
