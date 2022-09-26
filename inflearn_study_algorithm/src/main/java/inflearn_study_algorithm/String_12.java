package inflearn_study_algorithm;

import java.util.Scanner;

public class String_12 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-25
		* AUTHOR: dms873
		*
		* TITLE: 암호      
		*
		* COMMENT: #이면 1, *이면 0으로 7자리씩 10진수로 변경하여 암호 해석
		* 		   -> 입력받은 문자를 2진수로 변환 후 7자리씩 String[]에 담아줌 
		* 		   -> 해당 배열 반복문돌면서 2진수를 10진수로 바꿔주고 바뀐 10진수로 알파벳을 변환해주고 result변수에 담아줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보낸 문자 개수 : ");
		sc.nextInt();
		System.out.print("문자 입력 : ");
		String str = sc.next();
		
		String result = "";
		int fixLength = 7;
		String[] arr;
		int decimal = 0;
		char ch = 'a';
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '#') {
				result += 1;
			} else if(str.charAt(i) == '*') {
				result += 0;
			}
		}
		
		arr = result.split("(?<=\\G.{" + fixLength  + "})");
		
		result = "";
		
		for(int i = 0; i < arr.length; i++) {
			decimal = Integer.parseInt(arr[i], 2);
			ch = (char) decimal;
			result += ch;
		}
		sc.close();
		System.out.println("출력 >>>>>> " + result);
	}

}
