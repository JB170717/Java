package quiz13;

public class Tank extends Unit{

	private boolean changeMode = false;
	
	public Tank(){
		this.hp=100;;
	}
	
	public void changeMode() {
		changeMode =!changeMode;
	}

	@Override
	public void location() {
		//..
		
	}

	@Override
	public void move(int x, int y) {
		//..
		
	}
	
}
