import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class PersonManager1 {
	

	private ArrayList<Person> personManager1 = new ArrayList<Person>();
	private int j=0;

	public ArrayList<Person> getPersonManager1() {
		return personManager1;
	}

	public void setPersonManager1(ArrayList<Person> personManager1) {
		this.personManager1 = personManager1;
	}
	


	
	public void writeList(String search) throws Exception { 
	for ( Person p : personManager1) {
		BufferedWriter bw = null;
		try {
			String p1 = (String) toString(personManager1);
			p1 = "This object should be written to specified file";
			File file = new File("C:\\Users\\Admin\\Desktop\\Test.txt");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(p1);
			System.out.println("Success");
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally
		{
			try {
				if(bw!=null)
					bw.close();
			}catch(Exception ex) {
				System.out.println("Error");
			}
		}
	}
	}

	private Object toString(ArrayList<Person> personManager12) {
		// TODO Auto-generated method stub
		return null;
	}
}
//		bw.write(p.toString());
//		}
//	bw.close();
//	System.out.println("Success");
//	}
//	
//	File writer = new File("C:\\Users\\Admin\\Desktop\\Test.txt");
//	BufferedWriter bw = null;
//	
//	
//	
//}

