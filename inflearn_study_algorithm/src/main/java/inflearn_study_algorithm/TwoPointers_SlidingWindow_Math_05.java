package inflearn_study_algorithm;

import java.util.Scanner;

public class TwoPointers_SlidingWindow_Math_05 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-13
		* AUTHOR: dms873
		*
		* TITLE: 연속된 자연수의 합        
		*
		* COMMENT: 자연수를 입력받아 for문을 이용해 1~num까지 배열을 만들어줌
		* 		   -> 2개 이상 연속된 자연수의 합을 구하기 때문에 num과 arr[i]가 같으면 break로 탈출
		* 		   -> 2중 for문을 사용해 sum에 arr[j]값을 넣어주고 sum이 num과 같으면 result++하고 더 볼 필요없이 탈출
		* 		   -> 만약 sum이 num보다 크면 더 볼 필요없이 탈출
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("자연수 몇 ? : ");
		int num = sc.nextInt();
		int[] arr = new int[num+1];
		for(int i = 1; i <= num; i++) arr[i] = i;
		
		int result = 0;
		for(int i = 1; i < arr.length; i++) {
			int sum = 0;
			if(num == arr[i]) break;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(sum == num) {
					result++;
					break;
				}
				if(sum > num) break;
			}
		}
		sc.close();
		System.out.println(result);
	}

}
