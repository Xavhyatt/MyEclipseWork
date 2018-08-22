

public class MainGarage {

	public static void main(String[]args) {
		
		Car audi = new Car();
		audi.setmake("Audi");
		audi.setEngineSize(2.6);
		audi.setColour("Blue");
		audi.setWheels(4);
		audi.setRadioOn(true);
		audi.setnumberOfSeats(5);
		
		Motorbike yamaha = new Motorbike();
		yamaha.setmake("Yamaha");
		yamaha.setEngineSize(1.2);
		yamaha.setColour("Red");
		yamaha.setwheels(2);
		yamaha.setkickstart(true);
		
		Lorry mercedes = new Lorry();
		mercedes.setmake("Mercedes");
		mercedes.setEngineSize(6.4);
		mercedes.setColour("Silver");
		mercedes.setCapacity(8000);
		mercedes.setHeight(3);
		
		Garage.vehicles.add(audi);
		Garage.vehicles.add(yamaha);
		Garage.vehicles.add(mercedes);
		
		System.out.println(Garage.vehicles);
		System.out.println(Garage.costToFix(Garage.vehicles));
		
		
		
		
	}
}
