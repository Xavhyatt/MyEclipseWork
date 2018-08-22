import java.util.ArrayList;

public class Doggo 

{	
	
	public static ArrayList<Object> comp= new ArrayList<Object> ();
	
	
	public static void  range(int p)

	{
		
		
		for (int i=1; i<=comp.size();i++)
		{
			if (i==p)
			{
			continue;
			}
			else if (i==11 | i==12| i==13)
			{
				System.out.println(i + "th");
			}
			else if (i%10==1)
			{
				System.out.println(i + "st");
			}
			else if (i%10==2)
			{
				System.out.println(i + "nd");
				
			}
			else if (i%10==3)
			{
				System.out.println(i + "rd");
			}
			else if (i!=p)
			{
				System.out.println(i + "th");
			}
		}		
	}

	
	public static void main (String [] args)
	{
		
		
		Dog a1= new Dog();
		a1.setName("a1");
		
		Dog a2= new Dog();
		a2.setName("a2");
		
		Dog a3= new Dog();
		a3.setName("a3");
		
		
				
		comp.add(a1);
		comp.add(a2);
		comp.add(a3);
		
		
		for (int i=0; i<comp.size(); i++) {
			
			if (((Dog) comp.get(i)).getName() =="a2") 
			{
			i=i+1;
	
			range (i);
			
			}
			
		}
	}
}
