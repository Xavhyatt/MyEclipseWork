
public class Dissertation extends Media{

	private String university;
	private String department;
	
	public Dissertation(int mID, String author, String title, String release, String university, String department) {
		
		this.setmID(mID);
		this.setAuthor(author);
		this.setTitle(title);
		this.setReleaseDate(release);
		this.university = university;
		this.department = department;
	}

	String getUniversity() {
		return university;
	}

	void setUniversity(String university) {
		this.university = university;
	}

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + " university: " + university + ", department: " + department + "Type: Dissertation";
	}
	
}
