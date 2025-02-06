package api.lang.strbuilder;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		
		//빠른문자열
		String str = new String("java");
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		//차이점
		str =str+" programming"; //완전 새로운 문자열을 만들어서 저장했다
		
		sb.append(" programming"); //하나의 객체를 계속 재사용한다.
		
		System.out.println(str);
		System.out.println(sb);
		
		//객체를 계속만드는것 vs 한개의 객체만 사용하는 방법
		
		
		
		
		//문자열 중간에 추가 insert
		sb.insert(5,"book ");
		System.out.println(sb);
		
		//문자열의 변경 replace
		sb.replace(5, 9, "책"); //5~9미만 인덱스 변경
		System.out.println(sb);
		
		//문자열 삭제 delete
		sb.delete(5, 7); //5이상 7미만 인덱스 삭제
		System.out.println(sb);
		
		//빠른문자열을 -> 문자열로 변환
		String result = sb.toString();
		System.out.println("문자열:" + result);
		
		//거꾸로뒤집기
		System.out.println(sb.reverse());
		
		
		
	}

}
