
public class Main {

	public static void main(String[] args) {
		Person[] peoples  = {new Person("Paul", 32, "consultant"), new Person("Jake", 22, "chef"), new Person("Leo", 19, "unemployed")};

		for (Person p : peoples)
		{
			System.out.println(p.returnInfo());
		}
		
	}

}
