
public class RecursionFact {
	
	
	public static int recursionFact(int n) {
		
		if(n <= 1){
		return 1;
		}
		else 
			return n* recursionFact(n-1);

	}
	
//	public static int invRecursionFact(int a) {
//		
//		int n=1;
//		
//		if (a==1) {
//			return n;
//		}
//		if (a<n) {
//			System.out.println("Not a Factorial");
//		}
//		else 
//			a = a/n;
//			n++;
//			return  invRecursionFact(a); 
//	} 

}
