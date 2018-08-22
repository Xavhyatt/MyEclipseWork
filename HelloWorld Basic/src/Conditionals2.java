
public class Conditionals2 {
	
	public static int tester(int a, int b) {
		int c;
		boolean doesXavDeserveMore = true;
		if (a==0) {
			c = b;
		}
		if (b==0) {
			c = a;
		}
		else if (doesXavDeserveMore) {
		c = a * b;
		}
		else
		c = a + b;
	
		return c;
		
		
	}
	

	public static void main(String[] args) {
		
		
		System.out.println(tester(1, 5));
	}

}
