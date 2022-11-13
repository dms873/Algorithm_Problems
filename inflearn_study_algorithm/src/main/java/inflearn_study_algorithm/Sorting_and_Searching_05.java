package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting_and_Searching_05 {
	
	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-11-10
		* AUTHOR: dms873
		*
		* TITLE: 중복 확인   
		*
		* COMMENT: 값을 입력받아 ArrayList에 담아주고 반복문을 통해 해당숫자를 check변수에 넣어준 후 그 자리를 뺀다
		* 		   -> numbers에 해당 값이 포함되어 있으면 result 변수에 D 넣어주고 break; / 아니면 U를 넣어줌
		* 		   -> 다시 원래 자리에 해당 값을 넣어주면서 계속 반복함
		* 		   -> 속도는 오래 걸렸지만 이런 방법으로 풀었다를 위해 수정하지 않겠음
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < n; i++) numbers.add(sc.nextInt());
		sc.close();
		
		char result = ' ';
		for(int i = 0; i < numbers.size(); i++) {
			int check = numbers.get(i);
			numbers.remove(i);
			if(numbers.contains(check)) {
				result = 'D';
				break;
			} else result = 'U';
			numbers.add(i, check);
		}
		System.out.println(result);
	}

}
