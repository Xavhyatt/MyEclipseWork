
public class BunnyEars2 {
	
	public int bunnyEars2(int n) {
		
		if (n==0) {
			return 0;
		}
		
		if (n%2==0) {
			return bunnyEars2(n-1)+3;
		}
		else 
			return bunnyEars2(n-1)+2;
		
	}

}
