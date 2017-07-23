
public class Car extends Vehicle{

	int numDoors; 
	int numWheels;
	boolean fourWheelDrive; 
	
	public Car(int setID, String setName, int setValue,int setNumDoors,int setNumWheels,boolean set4WheelDrive )
	{
		super(setID, setName, setValue);
		
		numDoors = setNumDoors; 
		numWheels = setNumWheels; 
		fourWheelDrive = set4WheelDrive;
		
	}

}
