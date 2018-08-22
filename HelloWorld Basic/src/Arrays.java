
public class Arrays {
		
	
	public static int tester(int a, int b) {
		int c;
		boolean doesXavDeserveMore = false;
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
		
		int[] arrayOfInts = {1,2,4,8,16,32,64,128,256,512};
		
		for (int i: arrayOfInts) {
		System.out.println(tester(i, i));
	}
	}
}