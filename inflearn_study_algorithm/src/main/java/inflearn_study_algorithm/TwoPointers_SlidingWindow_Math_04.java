package inflearn_study_algorithm;

import java.util.Scanner;

public class TwoPointers_SlidingWindow_Math_04 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-13
		* AUTHOR: dms873
		*
		* TITLE: 연속 부분수열       
		*
		* COMMENT: 배열을 입력받아 2중 for문을 활용해 arr[j]를 sum에 담고 sum과 sumNum이 같으면 result++ 후 break;
		* 		   -> 만약 sum이 더 크면 더 비교할 필요 없으니 break로 안쪽for문 빠져나오고 i++이 됨
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("배열 크기 : ");
		int arrSize = sc.nextInt();
		// System.out.print("합 몇 ? : ");
		int sumNum = sc.nextInt();
		// System.out.print("배열 값 입력 : ");
		int[] arr = new int[arrSize];
		for(int i = 0; i < arrSize; i++) arr[i] = sc.nextInt();
		
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(sum == sumNum) {
					result++;
					break;
				}
				if(sum > sumNum) break;
			}
		}
		sc.close();
		System.out.println(result);
	}

}
