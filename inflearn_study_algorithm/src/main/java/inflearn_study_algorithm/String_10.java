package inflearn_study_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_10 {
	
	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-27
		* AUTHOR: dms873
		*
		* TITLE: 가장 짧은 문자거리     
		*
		* COMMENT: 공백을 기준으로 문자열을 잘라 str2, str3 변수에 담아줌 -> str2 : 문자열 / str3 : 해당 문자 
		* 		   -> 1번째 for문 : 문자열의 문자와 해당 문자가 같으면 cnt = 0이고 list배열에 추가 / 아니면 cnt++해서 list배열에 추가 
		* 		   -> 2번째 for문 : 문자열을 뒤에서부터 체크해서 문자와 해당 문자가 같으면 cnt = 0이고 list2배열에 추가 / 아니면 cnt++해서 list2배열에 추가
		* 		   -> list2는 거꾸로 저장되었기 때문에 reverse() 이용해서 뒤집어줌 
		* 		   -> 3번째 for문 : list와 list2배열 내에 있는 값들을 비교해서 작은 값이 result배열에 들어가게 함 
		* 
		**/
		
		String str = "eochjgoekghlakegh h";
		String str2 = "";
		String str3 = "";
		int cnt = 100;
		

		str2 = str.substring(0, str.lastIndexOf(" "));
		str3 = str.substring(str.lastIndexOf(" ") + 1);
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i) == str3.charAt(0)) {
				cnt = 0;
				list.add(cnt);
			} else {
				cnt++;
				list.add(cnt);
			}
		}
		
		cnt = 100;
		for(int i = str2.length()-1; i >= 0; i--) {
			if(str2.charAt(i) == str3.charAt(0)) {
				cnt = 0;
				list2.add(cnt);
			} else {
				cnt++;
				list2.add(cnt);
			}
		}
		
		Collections.reverse(list2);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > list2.get(i)) {
				result.add(list2.get(i));
			} else {
				result.add(list.get(i));
			}
		}
		System.out.println(result);
	}

}
