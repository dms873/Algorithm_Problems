package inflearn_study_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue_05 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-28
		* AUTHOR: dms873
		*
		* TITLE: 쇠막대기     
		*
		* COMMENT: 입력받은 문자열 중 () 모양을 |로 바꿔서 처리함
		* 		   -> '('면 막대기 길이가 시작된거니까 Stack에 추가해줌
		* 		   -> '|'면 막대기가 잘린거니까 Stack에 쌓인 개수만큼 result에 더해줌
		* 		   -> ')'면 막대기 길이가 닫힌거니까 Stack에 쌓여있는 '('를 pop()하고 result에 1를 더해줌
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		sc.close();
		
		int result = 0;
		str = str.replace("()", "|");
		
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(') st.add(ch);
			else if(ch == '|') result += st.size();
			else if(ch == ')') {
				st.pop();
				result++;
			}
		}
		System.out.println(result);
	}
}
