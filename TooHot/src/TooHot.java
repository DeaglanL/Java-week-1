public class TooHot {

	public static void main(String[] args) {
		int temp = 61;
		boolean isSummer = false; 
		boolean tempIsValid;
		
	    if(isSummer)
	    {
	    	System.out.println("Its summer :)");
	    	if(temp >= 60 & temp <= 100)
	    	{
	    		System.out.println("And the temp is valid");
	    		tempIsValid = true; 
	    	}
	    	else
	    	{
	    	System.out.println("And the temp is not valid");
    		tempIsValid = false; 
	    	}
	    }
	    else
	    {
	    	System.out.println("Its not summer :(");
	    
	    	if(temp >= 60 & temp <= 90)
	    	{
	    		System.out.println("And the temp is valid");
	    		tempIsValid = true; 
	    	}
	    	else
	    	System.out.println("And the temp is not valid");
    		tempIsValid = false; 
	    }

	}

}
