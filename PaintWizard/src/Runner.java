import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Surface Area of the walls?");

//		String dblInput = s1.next();
		
		

		double dblInput = sc.nextDouble();

		Room r1 = new Room(dblInput);

		Cheapo c1 = new Cheapo();
		AverageJoe a1 = new AverageJoe();
		Dulux d1 = new Dulux();

		double costC = c1.totalCost(r1.getWallVolume());
		double costA = a1.totalCost(r1.getWallVolume());
		double costD = d1.totalCost(r1.getWallVolume());

		if (costC < costA & costC < costD) {
			System.out.println("Cheapo is the Cheapest Option at : " + costC);

		}

		else if (costA < costC & costA < costD) {
			System.out.println("AverageJoe is the Cheapest Option at : " + costA);
		}

		else if (costD < costA & costD < costA) {
			System.out.println("Dulux is the Cheapest Option at : " + costD);
		}

		double leftC = c1.leftOver(r1.getWallVolume());
		double leftA = a1.leftOver(r1.getWallVolume());
		double leftD = d1.leftOver(r1.getWallVolume());

		if (leftC < leftA & leftC < leftD) {
			System.out.println("Cheapo will have the least left with : " + leftC);
		}

		else if (leftA < leftC & leftA < leftD) {
			System.out.println("AverageJoe will have the least left with : " + leftA);
		}

		else if (leftD < leftA & leftD < leftA) {
			System.out.println("Dulux will have the least left with : " + leftD);
		}
		System.out.println("Comparison:" + costC + " " + costA + " " + costD);

	}

}
