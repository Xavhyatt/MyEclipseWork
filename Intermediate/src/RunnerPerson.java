import java.util.ArrayList;

public class RunnerPerson {

	
	
	public static void main(String[]args) {
		
		Person john = new Person();
		john.setName("John");
		john.setAge(31);
		john.setJobTitle("Chemist");
		
		Person tom = new Person();
		tom.setName("Tom");
		tom.setAge(34);
		tom.setJobTitle("Banker");
		
		Person sara = new Person();
		sara.setName("Sara");
		sara.setAge(29);
		sara.setJobTitle("Doctor");
		
		
		ArrayList<Object> people = new ArrayList<Object>();
		people.add(john);
		people.add(tom);
		people.add(sara);
		
		int i;
		for(i=0; i<people.size(); i++) {
		
		System.out.println(people.get(i).toString());
		}
		
		for (i=0; i<people.size(); i++) {
			
			if (((Person) people.get(i)).getName() =="Tom") {
			System.out.println(((Person) people.get(i)).toString());
			}
		}
	}
}

