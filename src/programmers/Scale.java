package programmers;

import java.util.Arrays;

// Programmers : Àú¿ï
// https://programmers.co.kr/learn/courses/30/lessons/42886
class Scale {
    public int solution(int[] weight) {
        int answer = 1;
        Arrays.sort(weight);
        
        for(int e: weight){
            if(answer < e)
                break;
            answer += e;
        }
        return answer;
    }
}
