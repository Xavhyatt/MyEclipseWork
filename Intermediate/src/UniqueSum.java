
public class UniqueSum {
	
	public static int uniqueSum(int a, int b, int c) {
		int d = 0;
		
		if (a!=b & a!=c & b!=c) {
			d = a + b + c;
		}
		else if  (a==b) {
			return c;
		}
		else if (a==c) {
			return b;
		}
		else if (b==c) {
			return a;
		}
		
		return d;
	}
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(uniqueSum(1,2,3));
	}

}
