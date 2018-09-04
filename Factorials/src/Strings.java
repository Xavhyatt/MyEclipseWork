import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Strings {
	//iterative method
	//Doesn't work correctly
	
	public String lcs(String s1, String s2) {
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		int [][] array = new int [l1 + 1][l2 + 1];
		
		for (int i = 0 ; i<l1; i++) {
			
			for ( int j = 0 ; j<l2;j++) {
				
				if (s1.charAt(i) == s2.charAt(j)) {
					array[i+1][j+1] = array[i][j]+1;
				}
					
					else 
						array[i+1][j+1] = Math.max(array[i+1][j], array[i][j+1]);
					}
		}
			
		
			StringBuffer sb = new StringBuffer();
			
			for (int x = l1 , y = l2 ; x!= 0 && y != 0 ; ) {
				
				if (array[x][y] == array[x-1][y])
					x--;
				else if (array[x][y] == array[x-1][y])
					y--;
				else {
					assert s1.charAt(x-1)==s2.charAt(y-1);
					sb.append(s1.charAt(x-1));
					x--;
					y--;
				}
			}
				return sb.reverse().toString();
			
	}
				
//				if (s1.charAt(i)==s2.charAt(j)) {
//					sb.append(s1.charAt(i));
//					i++;
//					j++;
//				}
//				else if (array[i+1][j] >= array[i][j+1])
//					i++;
//				else
//					j++;
//			}
//			return sb.toString();
//			}
//		

	
	
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "ten green bottles sitting on the wall";
		String s2 = "ten red bot sat on the wall";
		
		Strings lcs1 = new Strings();
		String result = lcs1.lcs(s1, s2);
		
		System.out.println(result);
		

		
		
		
	}

}
