package inflearn_study_algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_HashSet_TreeSet_04 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-24
		* AUTHOR: dms873
		*
		* TITLE: 모든 아나그램 찾기      
		*
		* COMMENT: 비교할 문자열 길이만큼 map에 삽입 후 같은지 확인
		* 		   -> 다음 문자 추가, 첫 문자 제거 후 개수가 0개인 것 제거 후 같은지 확인 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("단어 입력 : ");
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		char[] arr = str.toCharArray();
		char[] arr2 = str2.toCharArray();
		sc.close();
		
		int result = 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < str2.length(); i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
		}
		
		if(map.equals(map2)) result++;
		
		for(int i = str2.length(); i < str.length(); i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			map.put(arr[i-str2.length()], map.get(arr[i-str2.length()]) - 1);
			if(map.get(arr[i-str2.length()]) == 0) map.remove(arr[i-str2.length()]);
			if(map.equals(map2)) result++;
		}
		System.out.println(result);
	}
}
