
public class Person {
	
	private int idNum;
	private String name;
	private String address;
	private String number;
	
	public Person(int idNum, String name, String address, String number) {
		this.idNum = idNum;
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	void setName(String name) {
		this.name = name;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setNumber(String number) {
		this.number = number;
	}
	int getIdNum() {
		return idNum;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "idNum: " + idNum + ", name: " + name + ", address: " + address + ", number: " + number + " ";
	}
	
	
	

}
