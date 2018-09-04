import java.util.HashMap;

public class Library {
	
	private static HashMap<Integer, Media> lib = new HashMap<>();

	static HashMap<Integer, Media> getLib() {
		return lib;
	}

	void setLib(HashMap<Integer, Media> lib) {
		this.lib = lib;
	}
	
	static void addMedia(Media media) {
		int i = lib.size() +1;
		lib.put(i, media);
		System.out.println(media + "Added!");
		
	}

//	@Override
//	public String toString() {
//		return "Library [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
//	
//	
	
	
	

}
