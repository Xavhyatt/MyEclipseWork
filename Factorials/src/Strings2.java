import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings2 {
	//Recursive method
	//Doesn't work correctly
	public static String lcs(String a, String b){
		
		
	    int aLen = a.length();
	    int bLen = b.length();
	    if(aLen == 0 || bLen == 0){
	        return "";
	    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
	        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
	            + a.charAt(aLen-1);
	    }else{
	        String x = lcs(a, b.substring(0,bLen-1));
	        String y = lcs(a.substring(0,aLen-1), b);
	        return (x.length() > y.length()) ? x : y;
	    }
	}



public static void main(Strings2[]args) {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String b = "ten green bottles sitting on the wall";
	String a = "ten red bot sat on the wall";
	
	Strings lcs1 = new Strings();
	String result = lcs1.lcs(a,b);
	
	System.out.println(result);
	
}
	
	
	
}