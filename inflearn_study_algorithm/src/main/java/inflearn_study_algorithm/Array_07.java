package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_07 {

	public static void main(String[] args) {

		/**
		* ABOUT
		*
		* DATE: 2022-10-02
		* AUTHOR: dms873
		*
		* TITLE: 점수계산      
		*
		* COMMENT: 입력된 채점 0일 경우 score를 0으로 해주고 0이 아니면 score++해준 후 total변수에 합해줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문제 개수 : ");
		int num = sc.nextInt();
		
		System.out.print("채점 : ");
		ArrayList<Integer> marking = new ArrayList<>();
		for(int i = 0; i < num; i++) marking.add(sc.nextInt());
		
		int score = 0;
		int total = 0;
		for(int i = 0; i < marking.size(); i++) {
			if(marking.get(i) == 0) {
				score = 0;
			} else {
				score++;
				total += score;
			}
		}
		sc.close();
		System.out.println(total);
	}

}
