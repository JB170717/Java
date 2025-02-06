package quiz12;

public class MainClass {

	
	public static void main(String[] args) {
		
		Shape cir = new Circle("circle", 4);
		Shape rec = new Rect("Rectangle",10,5);
		
		System.out.println(cir.getName());
		System.out.println(cir.getArea());
		
		System.out.println(rec.getName());
		System.out.println(rec.getArea());
	}
}
