
public class Newspaper extends Media{
	
	private String newspaperName;
	
	public Newspaper(int mID, String author, String title, String release, String newspaperName) {
	
	this.setmID(mID);	
	this.setAuthor(author);
	this.setTitle(title);
	this.setReleaseDate(release);
	this.newspaperName = newspaperName;
	}

	String getNewspaperName() {
		return newspaperName;
	}

	void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	@Override
	public String toString() {
		return super.toString() + " newspaperName: " + newspaperName + "Type: Newspaper Article";
	}


	
}


