package inflearn_study_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_Queue_07 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-28
		* AUTHOR: dms873
		*
		* TITLE: 교육과정 설계      
		*
		* COMMENT: 필수 과목으로 입력된 문자열을 Queue에 담고 수업 설계 문자열을 반복하며 해당 문자와 Queue에 담긴 첫번째 출력값이랑 다르면 NO로 하고 
		* 			Queue가 아직 비어있지 않으면 다음 문자 체크 Queue가 비어있으면 더 비교할 필요 없으므로 break;
		* 		   -> 해당 문자와 Queue에 담긴 첫번째 출력값이랑 같으면 Queue의 첫번째 출력값을 지워주고 YES로 하고 만약 Queue가 비어있으면 더 비교할 필요 없으므로 break;
		* 
		**/
		
		Scanner sc = new Scanner(System.in); 
		// System.out.print("필수 과목 : ");
		String sub = sc.nextLine();
		// System.out.print("수업 설계 : ");
		String cl = sc.nextLine();
		sc.close();
		
		Queue<Character> q = new LinkedList<>();
		for(int i = 0; i < sub.length(); i++) {
			q.add(sub.charAt(i));
		}
		
		String result = "";
		
		for(int i = 0; i < cl.length(); i++) {
			if(cl.charAt(i) != q.peek()) {
				result = "NO";
				if(!q.isEmpty()) continue;
				else break;
			} else if(cl.charAt(i) == q.peek()) {
				q.remove();
				result = "YES";
				if(q.isEmpty()) break;
			}
		}
		System.out.println(result);
	}
}
