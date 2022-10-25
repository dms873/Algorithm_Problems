package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap_HashSet_TreeSet_03 {

	public static void main(String[] args) {
		
		/*
		* ABOUT
		*
		* DATE: 2022-10-20
		* AUTHOR: dms873
		*
		* TITLE: 매출액의 종류         
		*
		* COMMENT: Time Limit 
		* 		   -> 2중 for문을 이용해 j가 배열의 제일 마지막이면 list에 값을 담아주고 break를 시켜주어 안쪽 for문을 빠져나옴
		* 		   -> breakNum에 i를 담아주어 flag를 해줌
		* 		   -> list에 값이 있으면 추가하지 않고 건너뛰고 없으면 list에 값을 추가해줌
		* 		   -> hashmap에 i+1과 list의 size를 담아줌
		* 		   -> 만약 breakNum이 0이 아니고 i와 같으면 break해서 바깥 for문을 빠져나옴
		* 		   -> list를 clear해줘서 비워줌
		* 		   -> entrySet을 이용해 map에 있는 value를 result 문자열에 담아줌 
		* 
		**/
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("배열 크기 : ");
		int arrSize = sc.nextInt();
		// System.out.print("며칠? : ");
		int days = sc.nextInt();
		// System.out.print("배열 값 입력 : ");
		int[] arr = new int[arrSize];
		for(int i = 0; i < arrSize; i++) arr[i] = sc.nextInt();
		sc.close();
		
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int breakNum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < i+days; j++) {
				if(j == arrSize-1) {
					list.add(arr[j]);
					breakNum = i;
					break;
				} else {
					if(list.contains(arr[j])) continue;
					else list.add(arr[j]);
				}
			}
			map.put(i+1, list.size());
			if(breakNum != 0 && breakNum == i) break;
			list.clear();
		}
		String result = "";
		for(Entry<Integer, Integer> entrySet : map.entrySet()) result += entrySet.getValue() + " ";
		System.out.println(result.trim());
	}
}
