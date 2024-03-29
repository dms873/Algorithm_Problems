package inflearn_study_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue_02 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-25
		* AUTHOR: dms873
		*
		* TITLE: 괄호 문자 제거      
		*
		* COMMENT: Stack을 이용해 str의 문자가 ')'가 아니면 Stack에 쌓아줌
		* 	 	   -> ')'면 Stack에 '('를 만날때까지 pop()을 해줌
		* 		   -> 만약 '('가 2개면 indexOf메소드와 lastIndexOf메소드를 활용해 비교해서 마지막'('만날때까지만 pop해주고 
		* 			  '('이 1개남으면 다음 ')'만날 때 pop()할거니까 break해줌
		* 		   -> Stack에 있는 원소를 result변수에 담아주고 출력
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		sc.close();
		
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ')') st.add(str.charAt(i));
			else {
				while(st.contains('(')) {
					if(st.indexOf('(') < st.lastIndexOf('(')) {
						st.pop();
						if(st.indexOf('(') == st.lastIndexOf('(')) break;
					} else st.pop();
				}
			}
		}
		String result = "";
		for(int i = 0; i < st.size(); i++) result += st.elementAt(i);
		System.out.println(result);
	}
}
