
public class Person {
	
	private String name;
	private String occpation;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccpation() {
		return occpation;
	}
	public void setOccpation(String occpation) {
		this.occpation = occpation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, String occupation, int age) {
		this.name = name;
		this.occpation = occupation;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ", " + occpation + ", " + age;
	}
	
	


}
