
public class Book extends Media {
	
	private String genre;
	private int edition;
	
	public Book(int mID, String author, String title, String release, String genre, int edition) {
		
		this.setmID(mID);
		this.setAuthor(author);
		this.setTitle(title);
		this.setReleaseDate(release);
		this.genre = genre;
		this.edition = edition;
	}
	
	
	String getGenre() {
		return genre;
	}
	void setGenre(String genre) {
		this.genre = genre;
	}
	int getEdition() {
		return edition;
	}
	void setEdition(int edition) {
		this.edition = edition;
	}


	@Override
	public String toString() {
		return super.toString() + " genre: " + genre + ", edition: " + edition + " Type: Book";
	}
	
	


}
