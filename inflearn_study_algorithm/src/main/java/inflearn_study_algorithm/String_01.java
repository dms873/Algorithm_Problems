package inflearn_study_algorithm;

import java.util.Scanner;

public class String_01 {

	/**
	* ABOUT
	*
	* DATE: 2022-09-23
	* AUTHOR: dms873
	*
	* TITLE: 문자 찾기
	*
	* COMMENT: 문자열과 문자를 입력받아 문자의 개수를 출력 
	* 
	**/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 : ");
		String text = sc.next();
		
		System.out.print("\n특정 문자를 입력해주세요 : ");
		char findText = sc.next().charAt(0);
		
		// 대소문자 구분하지 않아 모두 대문자로 바꿔서 비교 
		text = text.toUpperCase();
		findText = Character.toUpperCase(findText);
		
		int cnt = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == findText) {
				cnt++;
			}
		}
		sc.close();
		System.out.println("\n" + cnt);
	}
	
	
	
}
