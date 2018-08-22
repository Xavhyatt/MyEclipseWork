
public class Conditionals {
	
	public static int tester(int a, int b) {
		int c;
		boolean doesXavDeserveMore = true;
		
		if (doesXavDeserveMore) {
		c = a * b;
		}
		else
		c = a + b;
	
		return c;
		
		
	}
	

	public static void main(String[] args) {
		
		
		System.out.println(tester(4, 3));
	}

}
