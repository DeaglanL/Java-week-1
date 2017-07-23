import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Vehicle> contents;

	public Garage() {
		contents = new ArrayList<Vehicle>();
	}

	public void addVehicle(int setID, String setName, int setValue) {
		contents.add(new Vehicle(setID, setName, setValue));
	}

	public void addVehicle(int setID, String setName, int setValue, int cc) {
		contents.add(new Motorbike(setID, setName, setValue, cc));
	}

	public void addVehicle(int setID, String setName, int setValue, int numOfRotor, boolean gyro) {
		contents.add(new Helicopter(setID, setName, setValue, numOfRotor, gyro));
	}

	public void addVehicle(int setID, String setName, int setValue, int setNumDoors, int setNumWheels,
			boolean set4WheelDrive) {
		contents.add(new Car(setID, setName, setValue, setNumDoors, setNumWheels, set4WheelDrive));
	}

	public void removeVehicle(String Name) {
		for (Vehicle v : contents) {
			if (v.name == Name) {
				contents.remove(v);
			}
		}
	}

	public void removeVehicle(int id) {
		for (Vehicle v : contents) {
			if (v.id == id) {
				contents.remove(v);
			}
		}
	}

	public Vehicle searchByName(String name) {
		for (Vehicle v : contents) {
			if (v.name == name) {
				return v;
			}
		}
		return null;
	}

	public float fixPrice(Vehicle v) 
	{
		if (v instanceof Motorbike) 
		{
			return (v.value * 0.15f);
		} 
		else if (v instanceof Car)
		{
			return (v.value * 0.15f);
		} 
		else if (v instanceof Helicopter)
		{
			return (v.value * 0.72f);
		} 
		else
			return v.value * 0.5f;
	}

	public void empty() {
		contents.removeAll(contents);
	}

}
