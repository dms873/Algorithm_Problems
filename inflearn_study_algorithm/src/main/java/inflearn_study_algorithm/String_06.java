package inflearn_study_algorithm;

import java.util.Scanner;

public class String_06 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-24
		* AUTHOR: dms873
		*
		* TITLE: 중복 문자 제거  
		*
		* COMMENT: 문자열의 indexOf메소드를 활용해 입력받은 str을 반복문을 통해 해당 문자열 위치와 일치하면 result에 담아줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) {
				result += str.charAt(i);
			}
		}
		sc.close();
		System.out.println(result);
	}

}
