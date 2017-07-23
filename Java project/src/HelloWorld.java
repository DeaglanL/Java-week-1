
public class HelloWorld {

	public static void main(String[] args) {
		int[] arrayT = {2 ,3 ,0 ,5,1,0,3,0,0 , 321 , 23,431,32,13,21,3,4,1};
		int[] arrayQ = new int[11];
		String hw = "Hello World !";
		System.out.println(hw);
		paramTest(returnTest());
			
		System.out.println("2 + 3 = " + sum(2, 3));
		
		System.out.println("3 * 9 = " + sumOrMultiply(false, 3 , 9));
		
		System.out.println("return the non zero number out of  4 and 0, : " + conditions2(4, 0));
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println();
			System.out.println(conditions2(i, arrayT[i]));
		}
		
		for(int i = 0; i < arrayQ.length; i++)
		{
			arrayQ[i] = i; 
			arrayQ[i] *= 10;
			System.out.println(arrayQ[i]);
		}

	}
	
	static void paramTest(String t)
	{
		System.out.println(t);
	}
	
	static String returnTest()
	{
		return "Hello World !";
	}
	
	static int sum(int a, int b)
	{
		return a + b;
	}
	
	static int sumOrMultiply(boolean tOrF, int a, int b)
	{
		int result; 
		
		if (tOrF)
		{
			result = a + b;
		}
		else
			result = a * b;
		
		return result; 
	}
	
	static int conditions2(int a, int b)
	{
		if (a == 0)
		{
			return b;
		}
		else if(b == 0)
		{
			return a;
		}
		else
		return 0; 
	}

}
