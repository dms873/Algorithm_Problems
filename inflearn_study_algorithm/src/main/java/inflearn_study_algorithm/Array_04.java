package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-09
		* AUTHOR: dms873
		*
		* TITLE: 피보나치 수열       
		*
		* COMMENT: 1 1 을 arrayList에 미리 넣고 2부터 반복문 시작해서 전 값과 전전 값을 더해서 result에 담아주고 그 result를 arrayList에 추가해준다.
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(1);
		
		int result = 0;
		
		for(int i = 2; i < num; i++) {
			result += numList.get(i-1) + numList.get(i-2);
			numList.add(result);
			result = 0;
		}
		String str = numList.toString().replaceAll("[^0-9 ]","");
		sc.close();
		System.out.println(str);
	}

}
