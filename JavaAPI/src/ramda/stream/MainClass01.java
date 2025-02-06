package ramda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {
	
	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("홍길동","이순신","홍길자","신사임당");
		
		
		for(String s :list) {
			System.out.println(s); //프로그램코드처리..
		}
		
		System.out.println("--------------------------------");
		//여러분이 람다스트림을 알고있다면??? => list.stream()
		//stream 함수로 시작..
		
//		Stream<String> stream =list.stream();
//		//반복문
//		stream.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}			
//		});
		
		
		//forEach 반복문..
		
		list.stream().forEach(t->System.out.println(t));
	}

}
