
public abstract class Media {
	
	private int mID;
	private String author;
	private String title;
	private String releaseDate;
	
	int getmID() {
		return mID;
	}
	public void setmID(int mID) {
		this.mID = mID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "mID: " + mID + ", author: " + author + ", title: " + title + ", releaseDate: " + releaseDate+",";
	}
	

}
