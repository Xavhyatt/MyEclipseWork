
public class Calculator {
	
	private int a;
	private int b;
	private int c;
	
	public void calculate(int a, int b ,int c) {
		addition(a,b,c);
		subtract(a,b,c);
		multiply(a,b,c);
		divide(a,b,c);
		
	}

	public void addition(int a, int b, int c) {
		
		if(a+b==c) {
			System.out.println(a +"+"+ b+"="+c);
		}
		else if (a+c==b) {
			System.out.println(a +"+"+ c+"="+b);
		}
		else if (b+c==a) {
			System.out.println(b +"+"+ c+"="+a);
		}
	}
	
	public void subtract(int a, int b, int c) {
		
		if(a-b==c) {
			System.out.println(a +"-"+ b+"="+c);
		}
		else if (a-c==b) {
			System.out.println(a +"-"+ c+"="+b);
		}
		else if (b-c==a) {
			System.out.println(b +"-"+ c+"="+a);
		}
	}
	
	public void multiply(int a, int b, int c) {
		
		if(a*b==c) {
			System.out.println(a +"*"+ b+"="+c);
		}
		else if (a*c==b) {
			System.out.println(a +"*"+ c+"="+b);
		}
		else if (b*c==a) {
			System.out.println(b +"*"+ c+"="+a);
		}
	}
	
	public void divide(int a, int b, int c) {
		
		if(a/b==c) {
			System.out.println(a +"/"+ b+"="+c);
		}
		else if (a/c==b) {
			System.out.println(a +"/"+ c+"="+b);
		}
		else if (b/c==a) {
			System.out.println(b +"/"+ c+"="+a);
		}
	}
	
	public static void main(String[]args) {
		Calculator c1 = new Calculator();
		
		c1.calculate(9,12,108);
	}
}

