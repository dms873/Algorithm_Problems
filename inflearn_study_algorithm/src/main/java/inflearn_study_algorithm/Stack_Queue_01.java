package inflearn_study_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue_01 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-25
		* AUTHOR: dms873
		*
		* TITLE: 올바른 괄호      
		*
		* COMMENT: Stack을 이용해 입력받은 문자열 중 '('이면 stack에 넣어주고, ')'이면 pop을 해서 담겨있는 '('를 빼줌
		* 		   -> 만약 Stack에 담겨있는 '('이 없다면 짝이 맞지 않으므로 "NO"를 출력 후 반복문 빠져나옴
		* 		   -> 반복문 다 돈 후 Stack이 비어있으면 "YES"출력 / 아니면 "NO"출력
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		sc.close();
		
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') st.add(str.charAt(i));
			else {
				if(st.empty()) {
					System.out.println("NO");
					return;
				} else st.pop();
			}
		}
		if(st.empty()) System.out.println("YES");
		else System.out.println("NO");
	}
}
