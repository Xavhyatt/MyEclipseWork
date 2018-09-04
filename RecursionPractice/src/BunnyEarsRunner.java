

public class BunnyEarsRunner {

	public int recursion(int n) {

		if (n == 0) {
			return 0;
		}

		else
			return 2 + recursion(n - 1);

	}

	public static void main(String[] args) {

		// BunnyEarsRunner b = new BunnyEarsRunner();
		 Fibonacci f = new Fibonacci();
		 //System.out.println(b.recursion(10));
		 System.out.println(f.fibonacci(5));
		//
		// BunnyEars2 b2 = new BunnyEars2();
		// System.out.println(b2.bunnyEars2(5));
		//
		// Triangle t = new Triangle();
		// System.out.println(t.triangle(10));
		//
		// SumDigits s = new SumDigits();
		// System.out.println(s.sumDigits(521));

		// StringClean s1 = new StringClean();
		// System.out.println(s1.stringClean("xxyyxaj"));

		//System.out.println(method("xxxyxxxajjjpppaaxx"));

	}

	public static String method(String a) {

		if (a.length() == 0 || a.length() == 1) {
			return a;
		} else {

			if (a.charAt(a.length() -1) == a.charAt(a.length() -2)) {
				return method(a.substring(0, a.length() - 1));
			}

			return method(a.substring(0, a.length() - 1)) + a.charAt(a.length() - 1);

		}

	}

}
