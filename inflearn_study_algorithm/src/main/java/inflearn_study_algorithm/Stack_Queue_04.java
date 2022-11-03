package inflearn_study_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue_04 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-11-02
		* AUTHOR: dms873
		*
		* TITLE: 후위식 연산(postfix)      
		*
		* COMMENT: 문자열을 입력받아 해당 문자가 숫자면 stack에 쌓아주고, 숫자가 아니면 stack에 쌓인 숫자를 pop()해서 num1, num2 변수에 담아줌
		* 			-> 문자가 + - * / 인 경우 num1, num2 연산한 결과를 result에 담아주고 stack에 넣어줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		sc.close();
		
		int result = 0;
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				st.add(Character.getNumericValue(str.charAt(i)));
			} else {
				int num1 = st.pop();
				int num2 = st.pop();
				
				switch (str.charAt(i)) {
				case '+':
					result = num2 + num1;
					break;
				case '-':
					result = num2 - num1;
					break;
				case '*':
					result = num2 * num1;
					break;
				case '/':
					result = num2 / num1;
					break;
				}
				st.add(result);
			}
		}
		System.out.println(result);
	}
}
