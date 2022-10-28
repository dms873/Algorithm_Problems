package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
		
		// 대칭이 아닌경우 통과못함 
		// => 동영상 강의 => lt는 left(첫번째), rt는 right(마지막번째)
		// lt / rt 로 비교해서 lt가 특수문자면 lt++ / rt가 특수문자면 rt-- / 그것도 아니면(양쪽이 알파벳이면) 자리바꿔주고 lt++, rt-- 
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
