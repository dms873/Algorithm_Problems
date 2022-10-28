package inflearn_study_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-11
		* AUTHOR: dms873
		*
		* TITLE: 멘토링     
		*
		* COMMENT: 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[][] arr = new int[num2][num1];
		
		System.out.print("수학테스트 결과 학생 번호 입력 : ");
		for(int i = 0; i < num2; i++) {
			for(int j = 0; j < num1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < num1; i++) {
			for(int j = 0; j < num1; j++) {
			}
		}
		
		// 강사님 풀이
		/*
			3x4 배열일 때 
				0 1 2 3 : 등수 
			0
			1
			2 : 테스트 횟수
			
			** 4중 for문 사용 
			1) for i = 1 <= n 
			2) for j = 1 <= n / n : 학생번호 
			3) for k = 0 < m / m : test횟수
			4) for s = 0 < n / 0등 ~ 3등
				if(arr[k][s] == i) pi = s;
				if(arr[k][s] == j) pj = s;
				
			i = 3, j = 1일 때,
			pi = 0, pj = 2가 됨 (3번학생 0등, 1번학생 2등)
			
			if(pi < pj) cnt++;
			
			cnt가 test횟수와 같으면 answer++;
			
		*/
		
		System.out.println(Arrays.deepToString(arr));
		sc.close();
	}

}
