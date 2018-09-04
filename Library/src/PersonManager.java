import java.util.HashMap;

public class PersonManager {
	
	private static HashMap<Integer, Person> pm = new HashMap<>();

	public static HashMap<Integer, Person> getPersonManager() {
		return pm;
	}

	public void setPersonManager(HashMap<Integer, Person> personManager) {
		this.pm = personManager;
	}
	
	static void addPerson(Person person) {
		int i = pm.size() +1;
		pm.put(i, person);
		System.out.println(person + "Added!");
		
	}


		
	}
	
	

