
public class Person {
  String name; 
  String occupation;
  int age; 
  
  public Person(String Name, String Occupation, int Age)
  {
	  name = Name; 
	  occupation = Occupation;
	  age = Age; 
  }
	
  public String toString()
  {
	  return new String(name + " " + occupation + " " + age + "\n");
  }
	
}
