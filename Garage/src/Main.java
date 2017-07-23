
public class Main {

	public static void main(String[] args) {
		Garage myGarage = new Garage();
		
		System.out.println("Lets put some vehicles in the garage");
		System.out.println();
		
		myGarage.addVehicle(213215, "KawaskiNinja", 6200, 650);
		myGarage.addVehicle(8217893, "Airbus Helicopters EC145 T2", 500000, 2, false);
		myGarage.addVehicle(362714, "Mazda rx-8", 3850, 4, 4, false);
		myGarage.addVehicle(321987, "Subaru Impreza", 10000, 4, 4, true);
		
		System.out.println("Here are the vehicles in a the garage");
		
		for (Vehicle v : myGarage.contents)
		{
			System.out.println(v.name);
		}
		
		System.out.println();
		
		System.out.println("How much will the helicopter cost to repair?");
		System.out.println("Should be around £" + myGarage.fixPrice(myGarage.searchByName("Airbus Helicopters EC145 T2")));

		System.out.println();
		System.out.println("Ouch");
		
		System.out.println("Oh well, time to remove everything");
		
		myGarage.empty();
		
        System.out.println("Here are the vehicles in a the garage...");
		
		for (Vehicle v : myGarage.contents)
		{
			System.out.println(v.name);
		}
	}

}
