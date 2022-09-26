package inflearn_study_algorithm;

public class String_11 {

	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-09-25
		* AUTHOR: dms873
		*
		* TITLE: 문자열 압축      
		*
		* COMMENT: 현재 탐색한 문자와 전의 문자가 같으면 cnt증가 / 
		* 	       문자가 같지 않을 때 cnt가 1초과면 cnt를 result변수에 담아줌 /
		* 		   문자가 같지 않을 때 문자를 result변수에 담아주고 cnt 1로 초기화해줌 
		* 
		**/
		
		String str = "KKHSSSSSSSE";
		int cnt = 1;
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i != 0) {
				if(str.charAt(i) == str.charAt(i-1)) {
					cnt++;
				} else {
					if(cnt > 1) {
						result += cnt;
					}
					result += str.charAt(i);
					cnt = 1;
				}
			} else {
				result += str.charAt(i);
			}
		}
		
		System.out.println(result);
		
	}

}
