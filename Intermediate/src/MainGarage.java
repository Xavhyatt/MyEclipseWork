

public class MainGarage {

	public static void main(String[]args) {
		
		Car audi = new Car(2.6,"Audi","Blue",4,true,5);
		Motorbike yamaha = new Motorbike(1.2,"Yamaha","Silver",2,true);
		Lorry mercedes = new Lorry(6.4,"Mercedes","Silver",8000,3);
		
		Garage g = new Garage();
		
		
		g.addVehicle(audi);
		g.addVehicle(yamaha);
		g.addVehicle(mercedes);
		
		System.out.println(g.vehicles);
		
		g.costToFix(g.vehicles);
		g.removeVehicle(yamaha);
		System.out.println(g.vehicles);
		
		g.emptyGarage();
		
		System.out.println(g.vehicles);
	
		
	
			
	}
}
