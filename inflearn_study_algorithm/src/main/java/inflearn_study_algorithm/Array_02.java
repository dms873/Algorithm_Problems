package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-09
		* AUTHOR: dms873
		*
		* TITLE: 보이는 학생       
		*
		* COMMENT: 제일 먼저 입력된 학생 키를 max에 담아준 후 max보다 다음 키가 크면 max를 바꿔주고 cnt를 증가시켜준다.
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("학생 키 : ");
		ArrayList<Integer> stList = new ArrayList<>();
		for(int i = 0; i < num; i++) stList.add(sc.nextInt());
		
		int cnt = 1;
		int max = stList.get(0);
		
		for(int i = 1; i < stList.size(); i++) {
			if(stList.get(i) > max) {
				max = stList.get(i);
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
