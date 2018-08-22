
public class InverseFactorials {

	
	public static int inverseFact(double a) {
		
		double i = 1;
		
		
		while (a>i) 
		{
			a = a/i;
			i++;
			}
			if (a==i) 
			{
			System.out.println((int)i+"!");
			}
			
			else if (a<i)
			{
			System.out.println("None");
			}
		
		return (int) i;
	}
		
	
	public static void main(String[]args) {
		
		int a = 120;
		
		inverseFact(a);
		
		
	}
}