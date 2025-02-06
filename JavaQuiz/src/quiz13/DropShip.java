package quiz13;

public class DropShip extends Unit{
	
	private Unit[] arr =new Unit[8];
	private int index=0;
 	
	DropShip(){
		this.hp=60;
	}
	
	
	public void ride(Unit u) {
				
		if(u instanceof Marine && index<=7) {
			arr[index]=u;
			index++;
		}else if(u instanceof Tank && index<=4) {
			arr[index]=u;
			index+=4;
		}else {
			System.out.println("수송선에 자리가 부족합니다");
		}
	}
	
	
	@Override
	public void location() {
		// 
		
	}
	@Override
	public void move(int x, int y) {
		// 
		
	}
}
