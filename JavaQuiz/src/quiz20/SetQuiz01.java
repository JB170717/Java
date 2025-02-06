package quiz20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 로또 버호 자동 생성기
		 * Set을 이용해서 6개의 랜덤한 로또 번호를 만들어내는 프로그램 코드를 작성해보세요.
		 * 
		 * 1~45
		 * 
		 */
		
		Set<Integer> set = new HashSet<>();
		Random random = new Random();
		
		while(set.size()!=6) {
			set.add(random.nextInt(45)+1);
		}

		System.out.println(set.toString());
		
	}

}
