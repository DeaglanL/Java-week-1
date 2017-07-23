
public class Helicopter extends Vehicle {

	int numOfRotors;
	boolean gyro; 
	
	public Helicopter(int setID, String setName, int setValue , int setNumOfRotors, boolean gyroCopter) 
	{
		super(setID, setName, setValue);
		numOfRotors = setNumOfRotors; 
		gyro = gyroCopter; 
	}

}
