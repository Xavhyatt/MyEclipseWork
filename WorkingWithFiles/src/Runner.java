
public class Runner {
	
	public static void main(String[]args) throws Exception {
		
		Person p1 = new Person("Tom","Chemist",27);
		Person p2 = new Person("Sara","Doctor",31);
		Person p3 = new Person("Jess","Lawyer",29);
		Person p4 = new Person("Scott","PT",25);
		Person p5 = new Person("Mia","Banker",29);
		
		PersonManager1 pm1 = new PersonManager1();
		
		pm1.getPersonManager1().add(p1);
		pm1.getPersonManager1().add(p2);
		pm1.getPersonManager1().add(p3);
		pm1.getPersonManager1().add(p4);
		pm1.getPersonManager1().add(p5);
		
		
		
		
		pm1.writeList("Tom");
		
		
	}

}
