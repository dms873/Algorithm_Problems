package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-30
		* AUTHOR: dms873
		*
		* TITLE: 큰 수 출력하기      
		*
		* COMMENT: 공백기준으로 여러개의 숫자를 입력하게 되면 for문을 이용해 배열에 저장해줌
		* 		   -> 첫 번째 수는 무조건 출력하므로 result배열에 숫자 넣어줌 
		* 		   -> 두 번째 수부터 반복문 돌면서 앞의 숫자가 크면 result배열에 넣어줌
		* 		   -> result배열을 string으로 바꾸기 위해 replaceAll 함수를 사용하여 숫자+공백으로 치환해줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		ArrayList<Integer> numList = new ArrayList<>();
		int num = sc.nextInt();
		
		System.out.print(num + "개의 숫자 입력 : ");
		for(int i = 0; i < num; i++) {
			numList.add(sc.nextInt());
		}
		
		ArrayList<Integer> resultList = new ArrayList<>();
		// 첫 번째 수는 무조건 출력
		resultList.add(numList.get(0));
		String result = "";
		
		for(int i = 1; i < numList.size(); i++) {
			if(numList.get(i-1) < numList.get(i)) {
				resultList.add(numList.get(i));
			}
		}
		
		System.out.println(resultList.toString());
		result = resultList.toString().replaceAll("[^0-9 ]","");
		
		sc.close();
		System.out.println("출력 >>>>>>> " + result);
	}

}
