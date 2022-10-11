package inflearn_study_algorithm;

import java.util.Scanner;

public class Array_10 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-10
		* AUTHOR: dms873
		*
		* TITLE: 봉우리     
		*
		* COMMENT: 입력받는 숫자 외에 위아래양옆 0으로 채우기위해 배열 내 자리는 num+2 해줌
		* 		   -> 2차원배열 생성 시 1부터 num+1까지로 지정하여 나머지는 0이 들어가도록함
		* 		   -> 이중for문을 사용해 자기자신과 상하좌우를 체크해 자기자신이 제일크면 cnt++해줌
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		int[][] arr = new int[num + 2][num + 2];
		
		System.out.print("지역 높이 입력 : ");
		for(int i = 1; i < num+1; i++) {
			for(int j = 1; j < num+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int cnt = 0;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				// 상하좌우체크
				if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]) {
					cnt++;
				}
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}