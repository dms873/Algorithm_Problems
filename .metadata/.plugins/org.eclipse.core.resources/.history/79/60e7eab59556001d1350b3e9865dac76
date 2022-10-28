package inflearn_study_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue_03 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-26
		* AUTHOR: dms873
		*
		* TITLE: 크레인 인형뽑기(카카오)      
		*
		* COMMENT: 2중 for문을 사용해 바깥 for문은 moveArr만큼, 안쪽 for문은 arr의 길이만큼 반복함
		* 		   -> 열을 순회하기 때문에 arr[j][moveArr[i]-1]으로 체크
		* 		   -> 0이면 뽑을 인형이 없으므로 아무 행동도 안해도 되므로 0이 아닐경우 첫번째로 체크
		* 		   -> Stack에 아무것도 안쌓여있을 경우를 위해 empty()가 아니고 Stack에 쌓여있는 상단의 값이 arr[j][moveArr[i]-1]와 같으면 중복이므로 
		* 			  result에 2를 더해주고 pop()을 해주고 해당 위치를 0으로 세팅하고 moveArr의 다음 순서를 체크하기위해 break;
		* 		   -> 만약 0이 아닌데 Stack에 있는 값과 다를 경우 Stack에 push해서 값을 담아주고 해당 위치를 0으로 세팅 후 break;
		* 
		**/
		
		Scanner sc = new Scanner(System.in); 
		// System.out.print("배열크기 입력 : ");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Stack<Integer> st = new Stack<>();
		int result = 0;
		
		// System.out.print("어디 위치 움직? : ");
		int move = sc.nextInt();
		int[] moveArr = new int[move];
		for(int i = 0; i < move; i ++) moveArr[i] = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < moveArr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j][moveArr[i]-1] != 0) {
					if(!st.empty() && st.peek() == arr[j][moveArr[i]-1]) {
						result += 2;
						st.pop();
						arr[j][moveArr[i]-1] = 0;
						break;
					} else {
						st.push(arr[j][moveArr[i]-1]);
						arr[j][moveArr[i]-1] = 0;
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}
