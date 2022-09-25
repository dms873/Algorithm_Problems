package inflearn_study_algorithm;

import java.util.Scanner;

public class String_07 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-24
		* AUTHOR: dms873
		*
		* TITLE: 회문 문자열  
		*
		* COMMENT: 입력받은 문자열을 모두 대문자로 바꿔준 후 앞 단어와 뒷 단어가 일치하면 YES / 아니면 NO로 표시 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		String result = "";
		
		str = str.toUpperCase();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				result = "YES";
			} else {
				result = "NO";
			}
		}
		sc.close();
		System.out.println("출력 : " + result);
	}

}
