
public class TooHot {
	
	public static boolean hotAF(int a, boolean b) {
		
		boolean isSummer = b;
		
		if (a>=60 & a<=100 & isSummer) {
			return true;
		}
		
		else if (a>=60 & a<=90 & !isSummer) {
			return true;
		}
		else if (a<60 & (isSummer | !isSummer)) {
			return false;
		}
		
		return true;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("It's Too Hot?");
		System.out.println(hotAF(50,true));
	}

}
