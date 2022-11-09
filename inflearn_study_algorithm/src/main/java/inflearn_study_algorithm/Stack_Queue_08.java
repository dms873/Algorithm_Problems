package inflearn_study_algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_Queue_08 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-11-08
		* AUTHOR: dms873
		*
		* TITLE: 응급실     
		*
		* COMMENT: 몇 번째 환자를 추적할건지 pos변수를 통해 확인 
		* 		   -> q가 비어있을 때까지 반복을 돌며 q에 있는 맨 앞에 값이 맨 앞에 값 빼고 나머지 q들의 값중에 제일 큰 값이랑 비교해서 같거나 크면 result++ 해줌. 
		* 		   -> 이 때 pos변수가 0이면 result를 출력해주고 반복문을 끝냄.
		* 		   -> 맨 앞의 값이 q안에 있는 제일 큰 값보다 작으면 맨 앞에 값을 맨 뒤로 배치해줌
		* 		   -> 이 때 pos변수가 0이면 pos에 q의 사이즈를 넣어줌
		* 		   -> pos를 1 빼줌
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < n; i++) q.offer(sc.nextInt());
		sc.close();
		
		int pos = m; // m번째 환자 추적
		int result = 0;
		
		while(!q.isEmpty()) {
			int poll = q.poll();
			if(poll >= Collections.max(q)) { // 위험도가 가장 높으면
				result++;
				if(pos == 0) {
					System.out.println(result);
					return;
				}
			} else {
				q.offer(poll);
				if(pos == 0) pos = q.size();
			}
			pos--;
		}
		System.out.println(result);
	}
	
}
