import java.util.ArrayList;

public class PersonManager {
	
	private ArrayList<Person> peopleList = new ArrayList<Person>();

	public ArrayList<Person> getPeopleList() {
		return peopleList;
	}
	public void searchForName(String search) {
		
		for (Person p : peopleList) {
			if (p.getName().equals(search)){
				System.out.println("Found the Person");
			}
			else
					System.out.println("Person not Found");
				
			}
		
		
	}
}

