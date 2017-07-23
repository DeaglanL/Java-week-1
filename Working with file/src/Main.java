import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
 
		String output = "";
		String input = "";
		ArrayList<Person> lads = new ArrayList<Person>();
		ArrayList<Person> newLads = new ArrayList<Person>();
		
		lads.addAll(Arrays.asList(new Person("David", ".netdev", 23), new Person("Paul", "boxer", 29), new Person("Mario", "Plumber", 45), new Person("Luigi", "Sidekick", 42), new Person("Bowser", "Kidnapper", 120)));
		
		for(Person l : lads)
		{
			output += l; 
		}
		
		ReaderWriter.writeStringToFile(output, "/home/deaglanl/test.txt", false);

		
		input = ReaderWriter.readFileToString("/home/deaglanl/test.txt");
		
		input = input.replace("\n", " ");
		String[] splitInput = input.split(" ");
		
		for(int i = 0; i < (splitInput.length-3); i+=3)
		{
		  newLads.add(new Person(splitInput[0+i], splitInput[1+i], Integer.parseInt(splitInput[2+i])));	
		}
		
		for(Person l : newLads)
		{
			System.out.println(l); 
		}
		 
	} 

}
