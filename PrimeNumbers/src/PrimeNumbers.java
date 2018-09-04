import java.util.ArrayList;

public class PrimeNumbers {
	
	ArrayList<Integer> primeNum = new ArrayList<Integer>();
	
	
	
	public void isPrimeNumber() {
		
		primeNum.add(2);
		primeNum.add(3);
		primeNum.add(5);
		primeNum.add(7);
		System.out.println(primeNum);
		
		
		
		
		
		for ( int i=4 ; i<100; i++) {
			
			int b = (int) Math.pow(i, 0.5);
					
					int d;
					if(b%1==0) {
						d =b;
					}
					else 
						d= b+1;
			
			System.out.println(d);
			
			for (int p=0;i<primeNum.get(p); p++) {
				 
				double c = d/p;
				System.out.println(c);
				if ((c%1) != 0 )
					primeNum.add(i); 
			}
		}
		
		
		
		
		
		}
		
	 
	
	public static void main(String[]args) {
		
		PrimeNumbers pn = new PrimeNumbers();
		
		pn.isPrimeNumber();
		
	}


}
