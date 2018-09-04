
public class Triangle {
	
	
	public int triangle(int n) {
		
		if (n==1) {
			return 1;
		}
		else 
			return triangle(n-1)+2;
	}

}
