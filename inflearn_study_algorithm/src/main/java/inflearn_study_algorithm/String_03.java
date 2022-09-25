package inflearn_study_algorithm;

import java.util.Scanner;

public class String_03 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-24
		* AUTHOR: dms873
		*
		* TITLE: 문장 속 단어 
		*
		* COMMENT: 문자열을 입력받아 공백으로 구분하여 길이가 가장 긴 단어 찾아줌
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		String[] arr;
		
		arr = str.split(" ");
		
		int max = 0;
		String result = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i].length()) {
				max = arr[i].length();
				result = arr[i];
			}
		}
		sc.close();
		System.out.println("출력 >>>>>> " + result);

	}

}
