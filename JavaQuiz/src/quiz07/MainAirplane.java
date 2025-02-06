package quiz07;

public class MainAirplane {
	
	public static void main(String[] args) {
		SuperSonicAp ap =new SuperSonicAp("대한항공");
		
		ap.takeOff(); //상속받음
		ap.fly();
		ap.flyMode=1;
		ap.fly();
		ap.land();
		
	}

}
