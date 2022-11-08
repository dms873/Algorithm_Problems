package inflearn_study_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_Queue_06 {
	
	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-11-08
		* AUTHOR: dms873
		*
		* TITLE: 공주구하기     
		*
		* COMMENT: 왕자번호가 담긴 Queue를 1개만 남을때까지 반복하여 cnt와 k가 다르면 앞에 숫자를 꺼내 맨 뒤로 다시 넣어주고 cnt++;
		* 		   -> 같으면 앞에 숫자를 꺼내주고 cnt 초기화해줌 
		* 		   -> Queue에 있는 값 출력함
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) q.add(i);
		
		int cnt = 1;
		while(q.size() > 1) {
			if(cnt != k) {
				q.add(q.poll());
				cnt++;
			} else {
				q.poll();
				cnt = 1;
			}
		}
		System.out.println(q.peek());
	}

}
