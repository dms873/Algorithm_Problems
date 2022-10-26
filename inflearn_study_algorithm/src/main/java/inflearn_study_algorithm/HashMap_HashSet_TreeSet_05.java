package inflearn_study_algorithm;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMap_HashSet_TreeSet_05 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-24
		* AUTHOR: dms873
		*
		* TITLE: K번째 큰 수      
		*
		* COMMENT: Collections.reverseOrder메소드를 활용해 내림차순 정렬
		* 		   -> 3중 for문을 돌며 3개의 경우의 수를 뽑아 TreeSet에 추가함
		* 		   -> 중복 방지를 위해 바깥 for문 + 1를 해줌
		* 		   -> 큰 값으로 정렬된 set을 향상된 for문을 이용해 cnt와 num2가 같으면 해당 큰 값을 출력해줌
		* 		   -> 같은 값이 없으면 -1를 출력해줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i ++) arr[i] = sc.nextInt();
		sc.close();
		
		int result = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < num; i++) {
			for(int j = i + 1; j < num; j++) {
				for(int k = j + 1; k < num; k++) {
					set.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		int cnt = 0;
		for(int l : set) {
			cnt++;
			if(cnt == num2) {
				System.out.println(l);
				return;
			}
		}
		System.out.println(result);
	}
}
