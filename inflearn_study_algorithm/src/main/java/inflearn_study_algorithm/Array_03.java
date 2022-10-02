package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-30
		* AUTHOR: dms873
		*
		* TITLE: 가위 바위 보       
		*
		* COMMENT: 가위:1, 바위:2, 보:3 으로 계산하여 
		* 			A가 이겼을 때 "A"출력 / 비겼을 때 "D"출력 / B가 이겼을 때 "B"출력 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aList = new ArrayList<>();
		ArrayList<Integer> bList = new ArrayList<>();
		
		System.out.print("게임 횟수 : ");
		int gameCnt = sc.nextInt();
		
		System.out.print("A가 낸 가위바위보 : ");
		for(int i = 0; i < gameCnt; i++) aList.add(sc.nextInt());
		
		System.out.print("B가 낸 가위바위보 : ");
		for(int i = 0; i < gameCnt; i++) bList.add(sc.nextInt());
		
		for(int i = 0; i < gameCnt; i++) {
			if(aList.get(i) == bList.get(i)) System.out.println("D");
			else if((aList.get(i) == 1 && bList.get(i) == 3) || 
					(aList.get(i) == 2 && bList.get(i) == 1) || 
					(aList.get(i) == 3 && bList.get(i) == 2)) System.out.println("A");
				else System.out.println("B");
		}
		sc.close();
	}
}
