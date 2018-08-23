import java.util.ArrayList;

public class Garage {
	
//	private int numberOfBays;
//	private int numberOfMechanics;
//	
//	
//	public void setNumberOfBays(int numberOfBays) {
//		this.numberOfBays = numberOfBays;
//	}
//	
//	public void setNumberofMechanics(int numberOfMechanics) {
//		this.numberOfMechanics = numberOfMechanics;
//	}
//	
	public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	void addVehicle(Vehicle Vehicle1) {
				
				vehicles.add(Vehicle1);
				String make = Vehicle1.getMake();
				System.out.println(make + " Added!");
		}
		
	void costToFix(ArrayList<Vehicle> vehicles2) {
	
		for (int i = 0; i<vehicles.size() ; i++) {
			
			if ((vehicles.get(i).getClass())== Car.class) {
				double c = Vehicle.getBaseCost() * 1.5;
				String make =vehicles.get(i).getMake();
				
				System.out.println("Cost to fix "+ make + " is: " + c);
							
			}
			else if ((vehicles.get(i).getClass())==Motorbike.class) {
				double b = 0;
				b = Vehicle.getBaseCost() * 1.3;
				String make =vehicles.get(i).getMake();
				System.out.println("Cost to fix " + make + " is: " + b);
				
			}
			else if ((vehicles.get(i).getClass())==Lorry.class) {
				double d = 0;
				d = Vehicle.getBaseCost() * 2.5;
				String make =vehicles.get(i).getMake();
				System.out.println("Cost to Fix " + make + " is: " + d);
			}
		}
	}
	
	void removeVehicle(Vehicle Vehicle3) {
				
		for (Vehicle v : vehicles) {
			if ( v.getMake().equals(Vehicle3.getMake())) {
				String make = v.getMake();
				vehicles.remove(v);
				System.out.println(make + " removed!");
			}
			break;
		}
	}
	
	void emptyGarage() {
		vehicles.clear();
		System.out.println("Garage Emptied!");
	}
}