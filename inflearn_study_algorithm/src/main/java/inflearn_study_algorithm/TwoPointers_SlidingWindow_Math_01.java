package inflearn_study_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers_SlidingWindow_Math_01 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-12
		* AUTHOR: dms873
		*
		* TITLE: 두 배열 합치기      
		*
		* COMMENT: 배열 2개를 입력받아 System.arraycopy메소드를 활용해 원본 배열들을 resultArr에 복사함  
		* 		   -> Arrays.sort메소드를 활용해 오름차순으로 정렬
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
		
		int[] resultArr = new int[arrSize + arrSize2];
		
		// 복사할 원본 배열, 복사할 배열 시작 index, 복사한 원본배열을 넣을 배열, 몇 번째 index에 복사될지, 원본 배열에 복사될 element개수
		System.arraycopy(firstArr, 0, resultArr, 0, firstArr.length);
		System.arraycopy(secondArr, 0, resultArr, firstArr.length, secondArr.length);
		
		Arrays.sort(resultArr);
		
		sc.close();
		String str = Arrays.toString(resultArr).replaceAll("[^0-9 ]","");
		System.out.println(str);

	}

}
