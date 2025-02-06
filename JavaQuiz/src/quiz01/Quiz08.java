package quiz01;

public class Quiz08 {
	
	public static void main(String[] args) {	
	
		/*
		 * 랜덤한 배열의 요소를 선택하고, 
		 * 이 랜덤한 배열 요소에 따른 국가별 언어를 출력하면 됩니다.
		 * 배열의 인덱스는 0~3까지
		 */
		
		int a= (int)(Math.random()* 4); //0~3
		
		String[] arr1 = {"안녕하세요", "hello", "你好", "aw3oj1po2j"};		
		System.out.println("선택된단어: " + arr1[a]);
		
		String[] arr2 = {"한국어", "영어", "중국어", "외계어"};
		System.out.println(arr2[a] + " 입니다");
	
		
	}

}
