package inflearn_study_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_HashSet_TreeSet_02 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-20
		* AUTHOR: dms873
		*
		* TITLE: 아나그램(해쉬)        
		*
		* COMMENT: 문자열 2개 입력받아 char[]로 바꿔주고 각 문자와 개수를 키, 값으로 담아줌 
		* 		   -> 2개의 키, 값을 entrySet으로 같은지 비교하여 같으면 YES / 다르면 NO출력
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("단어 입력 : ");
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		char[] arr = str.toCharArray();
		char[] arr2 = str2.toCharArray();
		sc.close();
		
		HashMap<Character, Integer> m = new HashMap<>();
		HashMap<Character, Integer> m2 = new HashMap<>();
		m = anagram(arr);
		m2 = anagram(arr2);
		
		if(!m.entrySet().equals(m2.entrySet())) System.out.println("NO");
		else System.out.println("YES");
		
	}
	
	public static HashMap<Character, Integer> anagram(char[] charArr) {
		Arrays.sort(charArr);
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < charArr.length; i++) {
			int cnt = 0;
			for(int j = 0; j < charArr.length; j++) {
				if(charArr[i] == charArr[j]) cnt++;
			}
			map.put(charArr[i], cnt);
		}
		return map;
	}
}
