package inflearn_study_algorithm;

import java.util.Scanner;

public class String_02 {
	
	/**
	* ABOUT
	*
	* DATE: 2022-09-24
	* AUTHOR: dms873
	*
	* TITLE: 대소문자 변환 
	*
	* COMMENT: Character의 isUpperCase메소드를 사용해 대/소문자를 체크하여 변환해줌  
	* 
	**/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.next();
		
		char[] chStr = str.toCharArray();
		String result = "";
		
		for(int i = 0; i < chStr.length; i++) {
			
			if(Character.isUpperCase(chStr[i])) {
				result += Character.toLowerCase(chStr[i]);
			} else {
				result += Character.toUpperCase(chStr[i]);
			}
			
		}
		System.out.println("출력 >>>>>> " + result);
	}

}
