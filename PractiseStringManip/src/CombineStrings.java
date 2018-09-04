
public class CombineStrings {

	public String combineStrings(String a, String b) {

		String c = "";
		int max = Math.max(a.length(), b.length());

		for (int i = 0; i < max; i++) {
			String d = "";
			String e = "";

			if (a.length() > i) {

				d = a.substring(i, i + 1);
			}

			if (b.length() > i) {

				e = b.substring(i, i + 1);
			}

			c = c + d + e;

		}

		return c;
	}
	
//	public String combineStringsRec(String a, String b) {
//		
//		int n = Math.max(a.length(), b.length());
//		
//		
//		
//		
//	}
	
//	public String rec(String a, String b, int n){
//		
//		String c = "";
//		
//		if (n==0) {
//			return c;
//		}
//		else
//			if (a.length() > n) {
//
//				String d = a.substring( n, n + 1);
//			}
//
//			if (b.length() > n) {
//
//				String e = b.substring(n, n + 1);
//			}
//
//			c = c + d + e;
//			return rec(n+1);
//		
//		
//	}
	
	

	public static void main(String[] args) {

		CombineStrings c = new CombineStrings();

		System.out.println(c.combineStrings("Hi", "There"));

	}

}
