package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_08 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-10
		* AUTHOR: dms873
		*
		* TITLE: 등수 구하기     
		*
		* COMMENT: 입력받은 점수 개수만큼 resultList를 만들어 1로 채워준다.
		* 		   -> 점수 개수만큼 반복문을 돌아 i가 j보다 작으면 cnt++ 후 resultList의 i자리에 cnt값으로 변경해준다.
		* 		   -> 안쪽 반복문이 끝나면 cnt를 다시 1로 선언해준다.
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 몇 개 ? ");
		int num = sc.nextInt();
		
		System.out.print("점수 입력 : ");
		ArrayList<Integer> scoreList = new ArrayList<>();
		for(int i = 0; i < num; i++) scoreList.add(sc.nextInt());
		
		ArrayList<Integer> resultList = new ArrayList<>();
		for(int i = 0; i < scoreList.size(); i++) resultList.add(1);
		
		for(int i = 0; i < scoreList.size(); i++) {
			int cnt = 1;
			for(int j = 0; j < scoreList.size(); j++) {
				if(scoreList.get(i) < scoreList.get(j)) {
					cnt++;
					resultList.set(i, cnt);
				}
			}
		}
		String str = resultList.toString().replaceAll("[^0-9 ]","");
		sc.close();
		System.out.println(str);
	}

}
