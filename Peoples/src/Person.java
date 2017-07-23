
public class Person {
     String name; 
     int age;
	 String jobTitle;
	 
	 public String returnInfo()
	 {
		 return new String(name + " " + age + " " + jobTitle); 
	 }
	 
	public Person(String a, int b, String c)
	{
		name = a; 
		age = b; 
		jobTitle = c;
	}
}
