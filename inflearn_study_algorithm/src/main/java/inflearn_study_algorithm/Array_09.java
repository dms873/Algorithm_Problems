package inflearn_study_algorithm;

import java.util.Scanner;

public class Array_09 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-03
		* AUTHOR: dms873
		*
		* TITLE: 격자판 최대합       
		*
		* COMMENT: 입력받은 수를 2중 for문을 사용해 행/열로 나타내기 위해 2차원배열에 담아줌 
		* 		   -> 행/열의 합을 구해서 max가 행의 합 또는 열의 합보다 작으면 행의 합과 열의 합 중 큰 수를 max에 담아주고 다음 행/열을 합하기 위해 0으로 초기화 함  
		* 		   -> 왼쪽 대각선의 합은 0,0 / 1,1 / ... 으로 진행되어 arr[i][i]를 합계에 담아주고 max보다 크면 max변수에 담아줌 
		* 		   -> 오른쪽 대각선의 합은 0,4 / 1,3 / ... 으로 진행되어 arr[i][arr.length-1-i]를 합계에 담아주고 max보다 크면 max변수에 담아줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : "); // 5
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		
		System.out.print("자연수 : "); // 10 13 10 12 15 12 39 30 23 11 11 25 50 53 15 19 27 29 37 27 19 13 30 13 19

		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		10 13 10 12 15 
//		12 39 30 23 11 
//		11 25 50 53 15 
//		19 27 29 37 27 
//		19 13 30 13 19 
		
		int rowSum = 0, colSum = 0, max = 0, leftSum = 0, rightSum = 0;
		
		// 행, 열 합 구하기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
			if(max < colSum || max < rowSum) {
				if(rowSum > colSum) {
					max = rowSum;
				} else {
					max = colSum;
				}
			}
			rowSum = 0;
			colSum = 0;
		}
		
		// 대각선 합 구하기
		for(int i = 0; i < arr.length; i++) {
			leftSum += arr[i][i];
			rightSum += arr[i][arr.length-1-i];
		}
		if(max < leftSum) {
			max = leftSum;
		} else if(max < rightSum) {
			max = rightSum;
		}
		sc.close();
		System.out.println("큰 수 : " + max);
	}

}
