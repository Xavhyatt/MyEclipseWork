
public class IterationArray2 {

	public static void main(String[] args) {
		int[] arrayOfNums = new int [10];
		for (int i = 0 ; i<10 ; i++) {
		arrayOfNums [i] = i;
		if (i==9) {
			System.out.println(i + "...");
			break;
		}
		System.out.print(i+",");
		}
		System.out.println("\n");
		for (int i = 0 ; i<10 ; i++) {
			if (i==9) {
				System.out.println(i*10 + "...");
				break;
			}
		System.out.print(i*10+",");
			
		}
	}
}
