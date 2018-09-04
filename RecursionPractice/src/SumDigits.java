
public class SumDigits {
	int a = 0;
	
	public int sumDigits(int n) {
		
		
		if (n==0) {
			return a;
		}
		
		else 
		a = a + n%10;
		
		return sumDigits(n/10);
	}

}
