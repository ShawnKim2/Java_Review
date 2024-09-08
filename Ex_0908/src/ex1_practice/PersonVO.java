package ex4_practice;

public class PersonVO {
	private String name;
	
	private int age;
	
	private String phone;
	
	public PersonVO(){
		
	}
	
	public PersonVO(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	
	//toString method
	public String toString() {
		return name+"\t"+age+"\t"+phone;
	}
	
}
