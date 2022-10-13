package inflearn_study_algorithm;

import java.util.Scanner;

public class TwoPointers_SlidingWindow_Math_03 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-12
		* AUTHOR: dms873
		*
		* TITLE: 최대 매출       
		*
		* COMMENT: 배열과 연속 며칠일지 체크할 날짜를 입력 받고 for문은 arr.length-days까지 반복해줌
		* 		   -> while문을 통해 cnt가 days랑 같을 때 탈출하고, arr[i + cnt]를 sum에 넣어주고 cnt를 증가시켜줌
		* 		   -> while문을 빠져나오면 max와 sum을 비교해 sum이 크면 max의 값을 sum으로 바꿔줌
		* 		   -> 채점사이트 마지막 문제 Time Limit걸려서 통과 못함
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("배열 크기 : ");
		int arrSize = sc.nextInt();
		// System.out.print("연속 며칠? : ");
		int days = sc.nextInt();
		// System.out.print("배열 값 입력 : ");
		int[] arr = new int[arrSize];
		for(int i = 0; i < arrSize; i++) arr[i] = sc.nextInt();
		
		int sum = 0, cnt = 0, max = 0;
		for(int i = 0; i < arr.length-days; i++) {
			sum = 0;
			cnt = 0;
			while(true) {
				if(cnt == days) break;
				sum += arr[i + cnt];
				cnt++;
			}
			if(max < sum) max = sum;
		}
		sc.close();
		System.out.println(max);
	}

}
