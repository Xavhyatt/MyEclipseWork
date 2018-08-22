
class Person {
	
	private String name;
	private int age;
	private String jobTitle;
	
	public void setName(String name) {
		this.name = name;
		}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String toString() {
		String str = (name + "," + age + "," + jobTitle);
		return str;
	}
	public String getName() {
		return this.name;
	}
}
	
