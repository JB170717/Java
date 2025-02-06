package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	
	public static void main(String[] args) {
		
		//값을 자동 정렬해서 저장합니다.
		Queue<Integer> queue = new PriorityQueue<>();

		//값 뒤에 추가
		queue.offer(4);
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println(queue.toString()+"실제론 이렇지 않다.. 이거 잘못된거임");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("-------------------------------------------");
		
		Queue<User> que =new PriorityQueue();
		
		/*
		 * 우선순위 큐가 순서를 확인할 때 compareTo메서드의 존재여부를 확인합니다.
		 * compareTo메서드의 정의된 순서에 따라서 우선순위 값을 지정하게됩니다
		 * 
		 * compareable인터페이스를 상속받아서 compareTo메서드를 오버라이딩하면 됩니다.
		 * 
		 */
		
		//문자열 비교와 숫자의 비교 compareTo메서드를 오버라이딩하여 사용한다
		
		System.out.println("홍길동".compareTo("홍길자"));
		System.out.println("홍길자".compareTo("홍길동"));
		
		
		que.offer(new User("홍길동",10));
		que.offer(new User("홍길자",30));
		que.offer(new User("이순신",20));
		que.offer(new User("신사임당",40));
		
		System.out.println(que.toString());
		
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		
		
		
		
		
		
	}

}
