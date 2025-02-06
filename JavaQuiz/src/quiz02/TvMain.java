package quiz02;

public class TvMain {
	public static void main(String[] args) {
		
		Tv my = new Tv();
		my.power();// 전원켜
		my.changeChannel(5);
		my.info();
		my.power(); // 전원꺼	
	}
}
