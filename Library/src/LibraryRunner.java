import java.util.HashMap;

public class LibraryRunner {
	
	public static void main(String[]args) {
		
		LibraryRunner l = new LibraryRunner();
		
		Person john = new Person(1,"John","12 T St", "1234");
		Person tom = new Person(2,"Tom","5 ABC Lane","2020");
		Book b1 = new Book(1,"JJK","The Life Of JJK","01/01/2012","Autobiography",1);
		Dissertation d1 = new Dissertation(2,"Kurt","A Study of Uni Life", "05/05/2016","Leeds Beckett","Sociology" );
		Newspaper n1 = new Newspaper(3,"Sara W","Royals","20/07/2017","The Sun");
				
		
		HashMap<Integer, Person> pm = PersonManager.getPersonManager();
		
		PersonManager.addPerson(john);
		PersonManager.addPerson(tom);
		
		
		
				
		HashMap<Integer, Media> lib1 = Library.getLib();
		Library.addMedia(b1);
		Library.addMedia(d1);
		Library.addMedia(n1);
		
		
		
		
		
	}

}
