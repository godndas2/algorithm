package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// https://programmers.co.kr/learn/courses/30/lessons/42628
// Programmers : 이중순위큐
public class DoubleQueue {
	public int[] solution(String[] test) {
		int[] answer = new int[2];
		Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		Queue<Integer> min = new PriorityQueue<>();
		
		for (String hello : test) {
			String[] console = hello.split(" ");
			if (console[0].equals("H")) {
				max.add(Integer.parseInt(console[1]));
				min.add(Integer.parseInt(console[1]));
			} else if(!max.isEmpty()){
				if (console[1].equals("1")) delete(min,max.poll()); 
				else delete(max,min.poll());
				}
			}
			answer[0] = min.isEmpty() ? 0 : max.poll();
			answer[1] = min.isEmpty() ? 0 : min.poll();
			return answer;
	}
		
		public void delete(Queue<Integer> queue, int num) {
			List<Integer> tmp = new ArrayList<>();
			while (!queue.isEmpty()) {
				int push = queue.poll();
				if (push == num) {
					break;
				}
				tmp.add(push);
			}
	}
	}
