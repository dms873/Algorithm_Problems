package inflearn_study_algorithm;

import java.util.Scanner;

public class TwoPointers_SlidingWindow_Math_06 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-18
		* AUTHOR: dms873
		*
		* TITLE: 최대 길이 연속부분수열       
		*
		* COMMENT: 2중 for문으로 체크해서 arr[j]가 1이면 cnt++
		* 		   -> 만약 arr[j]가 0이고 아직 바꿀기회가 남아있으면 1로 간주하고 cnt++ 후 기회1번 소모 num2--;
		* 		   -> 안쪽 for문 다 돌고난 후 max와 cnt비교해서 cnt가 크면 max에 담아줌
		* 		   -> cnt = 0으로 초기화, num2는 입력받은 바꿀기회횟수로 초기화
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("수열 길이 : ");
		int arrSize = sc.nextInt();
		// System.out.print("몇 번 변경? : ");
		int num = sc.nextInt();
		// System.out.print("배열 값 입력 : ");
		int[] arr = new int[arrSize];
		for(int i = 0; i < arrSize; i++) arr[i] = sc.nextInt();
		
		int cnt = 0, max = 0, num2 = num;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[j] == 1) cnt++;
				else if(arr[j] == 0 && num2 > 0) {
					cnt++;
					num2--;
				}
				else break;
			}
			if(max < cnt) {
				max = cnt;
			}
			cnt = 0;
			num2 = num;
		}
		sc.close();
		System.out.println(max);
	}
}
