package ramda.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
//		p.greeting(new Say01() {
//			
//			@Override
//			public void talking() {
//				System.out.println("안녕하시오~");
//				
//			}
//		});
		
		//람다식
		p.greeting(() -> {
			System.out.println("하이욤");
		});
		
		
//		p.greeting(new Say02() {
//			
//			@Override
//			public void talking(String word) {
//				System.out.println(word);
//				// f(f(x)) 고차함수 구조... 메서드(객체.메서드)구조
//				
//				
//			}
//		});
		
		// 익명객체 람다식 문법
		//1. 타입은 생략이 가능함
		//2. 매개변수가 1개라면 ()도 생략이 가능함
		//3. 프로그램 코드가 한줄이면 중괄호도 생략 가능
		//4. {}를 생략하고 프로그램 코드가 한줄이면 return키워드가 생략됨
		
//		p.greeting(/*(/*String*/ word/*)*/ -> {
//			System.out.println(word);
//		});
		p.greeting(word-> System.out.println(word));
		
//		p.greeting(new Say03() {
//			
//			@Override
//			public String talking(String word, int i) {		
//				return word+i;
//			}
//		});
		
		p.greeting((word, i) -> word+i);
		
	}

}
