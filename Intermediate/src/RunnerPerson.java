
public class RunnerPerson {

	
	
	public static void main(String[]args) {
		
		Person john = new Person("John",31,"Chemist");
		
		Person tom = new Person("Tom",34,"Banker");
		
		Person sara = new Person("Sara",29,"Doctor");
		
		Person p1 = new Person("Jeff", 27, "PT");
		
		PersonManager pm1 = new PersonManager();
		
		pm1.getPeopleList().add(john);
		pm1.getPeopleList().add(tom);
		pm1.getPeopleList().add(sara);
		pm1.getPeopleList().add(p1);
		
		for (Person p : pm1.getPeopleList()) {
			System.out.println(p);
		}	
		
		pm1.searchForName("John");
		
			
		}
//		pm1.getPeopleList().remove(p1);
//		for (Person p : pm1.getPeopleList()) {
//		System.out.println(p);}
//		
//		ArrayList<Object> people = new ArrayList<Object>();
//		people.add(john);
//		people.add(tom);
//		people.add(sara);
		
//		int i;
//		for(i=0; i<people.size(); i++) {
//		
//		System.out.println(people.get(i).toString());
//		}
//		
//		for (i=0; i<people.size(); i++) {
//			
//			if (((Person) people.get(i)).getName() =="Tom") {
//			System.out.println(((Person) people.get(i)).toString());
//			}
//		}
//	}
}

