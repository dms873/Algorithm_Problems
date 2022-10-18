package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwoPointers_SlidingWindow_Math_02 {
	

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-12
		* AUTHOR: dms873
		*
		* TITLE: 공통원소 구하기      
		*
		* COMMENT: 두 배열을 입력받아 2중 for문을 활용해 두 배열 element를 비교해 같으면 resultArr에 넣어줌
		* 		   -> Collections.sort메소드를 활용해 오름차순으로 정렬
		* 		   -> 채점사이트 마지막 문제 Time Limit걸려서 통과 못함
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("첫 번째 배열 크기 : ");
		int arrSize = sc.nextInt();
		// System.out.print("첫 번째 배열 값 입력 : ");
		int[] firstArr = new int[arrSize];
		for(int i = 0; i < arrSize; i++) firstArr[i] = sc.nextInt();
		
		// System.out.print("두 번째 배열 크기 : ");
		int arrSize2 = sc.nextInt();
		// System.out.print("두 번째 배열 값 입력 : ");
		int[] secondArr = new int[arrSize2];
		for(int i = 0; i < arrSize2; i++) secondArr[i] = sc.nextInt();
		
		ArrayList<Integer> resultArr = new ArrayList<>();
		
		for(int i = 0; i < firstArr.length; i++) {
			for(int j = 0; j < secondArr.length; j++) {
				if(firstArr[i] == secondArr[j]) resultArr.add(firstArr[i]);
			}
		}
		sc.close();
		Collections.sort(resultArr);
		String str = resultArr.toString().replaceAll("[^0-9 ]","");
		System.out.println(str);

	}

}
