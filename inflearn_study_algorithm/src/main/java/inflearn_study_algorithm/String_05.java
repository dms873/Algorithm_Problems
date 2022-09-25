package inflearn_study_algorithm;

import java.util.Scanner;

public class String_05 {
	
	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-24
		* AUTHOR: dms873
		*
		* TITLE: 특정 문자 뒤집기  
		*
		* COMMENT: Character의 isAlphabetic메소드를 사용해 대칭이 알파벳이면 뒤에서부터 result에 넣어주고 아니면 앞에서부터 반복하여 넣어줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char check;
		char check2;
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			check = str.charAt(i); // 앞에서 
			check2 = str.charAt(str.length()-1-i); // 뒤에서 
			if(Character.isAlphabetic(check) && Character.isAlphabetic(check2)) {
				result += check2;
			} else {
				result += check;
			}
		}
		sc.close();
		System.out.println("출력 >>>>> " + result);
	}

}
