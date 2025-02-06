package quiz12;

public class Circle extends Shape {
	//원형은 생성될 때 이름과, 반지름의 길이를 받도록 처리하고,
	//getArea()는 원형의 넓이를 계산하도록 오버라이딩 처리
	//main에서 확인
	
	private int r;
	
	
	//생성자 연결이 첫번째이다...
	public Circle(String name, int r) {
		super(name);
		this.r=r;
	}
	
	public double getArea() {		
		return r*r*Math.PI;
	}

}
