package quiz13;

public class Marine extends Unit {

	public static int attack;
	public static int armor;
	
	Marine(){
		this.hp=60;
		this.attack = 6;
		this.armor = 0;
	}
	
	public void StimPack() {		
		attack+=1;
		System.out.println("스팀팩빨음");
	}

	@Override
	public void location() {
		System.out.println("현재위치:"+x+","+y);
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치이동:"+x+ ","+y);
		
	}
		
		
		
		
	

}
