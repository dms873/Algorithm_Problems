package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_06 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-10
		* AUTHOR: dms873
		*
		* TITLE: 뒤집은 소수     
		*
		* COMMENT: 숫자들을 입력받아 String으로 변환 후 StringBuilder의 reverse메소드를 이용해 뒤집어주고 Integer로 형변환하여 numList에 추가해줌
		* 		   -> 소수판별 메서드를 통해 소수면 resultList에 해당 값을 담아줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수 개수 : ");
		int num = sc.nextInt();
		
		System.out.print("숫자 입력 : ");
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i = 0; i < num; i++) {
			String str = String.valueOf(sc.nextInt());
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			numList.add(Integer.parseInt(sb.toString()));
		}
		
		ArrayList<Integer> resultList = new ArrayList<>();
		
		for(int i = 0; i < numList.size(); i++) {
			if(isPrime(numList.get(i))) resultList.add(numList.get(i));
		}
		
		String str = resultList.toString().replaceAll("[^0-9 ]","");
		sc.close();
		System.out.println(str);
	}
	
	// 소수인지 확인하는 메서드
	public static boolean isPrime(int num) {
	  if (num == 1) return false;
	  for (int i = 2; i < num; i++) {
	    if(num%i==0) return false;
	  }
	  return true;
	}

}
