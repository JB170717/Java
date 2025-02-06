package quiz20;

import java.util.Random;

public class Customer {
	
	private String name;
	private int arrivalTime =(int)(Math.random()*3+1);
	
	public Customer(){};

	public Customer(String name) {
		super();
		this.name = name;
		this.arrivalTime = arrivalTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	
	
	
}
