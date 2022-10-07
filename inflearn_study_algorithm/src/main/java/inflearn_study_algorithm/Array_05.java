package inflearn_study_algorithm;

import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-07
		* AUTHOR: dms873
		*
		* TITLE: 소수(에라토스테네스 체)      
		*
		* COMMENT: 강사님 풀이로 적용
		* 		   -> 2의 배수들 1로 체크 후 i++
		* 		   -> 3 cnt++; 후 1로 체크
		* 		   -> 3의 배수들 1로 체크 후 i++
		* 		   -> 5 cnt++; 후 1로 체크
		* 		   -> 이런식으로 0을 만나면 cnt++하고 1로 바꿔주고 그 배수들 1로 체크 후 i++
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수 개수 : ");
		int num = sc.nextInt();
		
		int cnt = 0;
		
		int[] arr = new int[num + 1];
		for(int i = 2; i <= num; i++) {
			if(arr[i] == 0) {
				cnt++;
				for(int j = i; j <= num; j = j + i) arr[j] = 1;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
