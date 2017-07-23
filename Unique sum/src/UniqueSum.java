
public class UniqueSum {

	public static void main(String[] args) {
		int a = 7; 
		int b = 2; 
		int c = 3;
		
		if(a == b)
		{
			if(a == c)
			{
				if(c == b)
				{
					c = 0;
					b = 0;
				}
				a = 0;
				c = 0;
			}
			a = 0;
			b = 0;
		}	
		System.out.println(a + b + c);

	}

}
