package inflearn_study_algorithm;

import java.util.Scanner;

public class String_09 {
	
	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-24
		* AUTHOR: dms873
		*
		* TITLE: 숫자만 추출    
		*
		* COMMENT: Character의 isDigit메소드를 활용하여 숫자만 result에 담아줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				result += str.charAt(i);
			}
		}
		sc.close();
		System.out.println(Integer.parseInt(result));
	}

}
