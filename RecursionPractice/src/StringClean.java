
public class StringClean {
	
	public String stringClean(String a) {
		
		String b = "";
		
		int n = a.length();
		
		if (n==0) {
			return b;
		}
		if (a.substring(n-2, n-1).equalsIgnoreCase(a.substring(n-1, n))) {
			b = a.replace(a.substring(n),"");
			a = b;
			return stringClean(a);
			}
		
		else
			return stringClean(a);
			
	}
	
	

}
