package quiz21;

public class Data {
	
	private String name;
	private int age;
	private String Email;	
	private String address;
	
	public Data(){}
	
	public Data(String name, int age, String email, String address) {
		super();
		this.name = name;
		this.age = age;
		this.Email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\n Data [name=" + name + ", age=" + age + ", Email=" + Email + ", address=" + address + "]";
	}
	
	
	
	

}
