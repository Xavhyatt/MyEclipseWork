
public class Blackjack {

	public static int blackjack(int a, int b) {
		
		int c = 0;
		
			
		if (a>=b & a<=21 & a>0) {
			return a;
		}
		else if (b>a & b<=21 & b>0) {
			return b;
		}
		else if (a>21 & b<=21 & b >0) {
			return b;
		}
		else if (b>21 & a<=21 & a>0) {
			return a;
		}
		
		return c;
	}

		
	public static void main(String[] args) {
		
		System.out.println(blackjack(20,22));

	}

}
