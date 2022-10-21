package inflearn_study_algorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap_HashSet_TreeSet_01 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-10-18
		* AUTHOR: dms873
		*
		* TITLE: 학급 회장(해쉬)        
		*
		* COMMENT: HashMap<Charater, Integer>로 선언하여 2중 for문에서 arr[i]와 arr[j]의 값이 같으면 cnt++해주고,
		* 		   안쪽 for문이 끝나면 map에 arr[i]와 cnt를 키, 값으로 넣어줌
		* 		   -> Collections의 max메소드를 활용해 최대값 value를 maxValue에 담아줌
		* 		   -> 향상된 for문을 활용해 key, value를 모두 순회하기 위해 Entry형태로 map을 순회하면서 
		* 			  maxValue에 담긴 최대값과 순회하고 있는 값이 같으면 해당 key를 출력해줌
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("학생 수 : ");
		int n = sc.nextInt();
		char[] arr = new char[n];
		// System.out.print("선택한 후보 기호 : ");
		String str = sc.next();
		for(int i = 0; i < n; i++) arr[i] = str.charAt(i);
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) cnt++;
			}
			map.put(arr[i], cnt);
		}
		sc.close();
		
		// hashmap에 담긴 value중 최대값을 구해 최대값 value에 해당하는 key를 출력
		int maxValue = Collections.max(map.values());
		for(Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue() == maxValue) System.out.println(m.getKey());
		}
	}
}
