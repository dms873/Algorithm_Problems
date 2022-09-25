package inflearn_study_algorithm;

import java.util.Scanner;

public class String_04 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-24
		* AUTHOR: dms873
		*
		* TITLE: 단어 뒤집기  
		*
		* COMMENT: 문자열을 n개 만큼 입력받아 StringBuffer의 reverse메소드를 이용해 문자 뒤집기 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		String str = "";
		StringBuffer sb = new StringBuffer();
		String result = "";
		
		for(int i = 0; i < num; i++) {
			System.out.print("문자열 입력 : ");
			str = sc.next();
			sb = new StringBuffer(str).reverse();
			result += sb + "\n";
		}
		sc.close();
		System.out.println("\n🔽 출력 🔽\n" + result);
	}

}
