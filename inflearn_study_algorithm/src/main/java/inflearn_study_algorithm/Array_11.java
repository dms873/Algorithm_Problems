package inflearn_study_algorithm;

import java.util.Scanner;

public class Array_11 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-07
		* AUTHOR: dms873
		*
		* TITLE: 임시반장 정하기        
		*
		* COMMENT: 강사님 풀이로 적용
		* 		   -> 3중 for문 사용 (k는 1학년~5학년)
		* 		   -> i번 학생의 k번 학년과 j번 학생의 k번 학년과 반이 같은지 확인 -> cnt++; 후 break;
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int num = sc.nextInt();
		int[][] arr = new int[num+1][6];
		
		System.out.print("1학년 ~ 5학년 반 : ");

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0, result = 0;
		
		for(int i = 1; i <= num; i++) {
			int cnt = 0;
			for(int j = 1; j <= num; j++) {
				for(int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(max < cnt) {
				max = cnt;
				result = i;
			}
		}
		sc.close();
		System.out.println(result + "번 학생 반장 당첨!");
	}

}
