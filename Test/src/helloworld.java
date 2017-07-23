public class helloworld {

    public static void main(String[] args) {
    	int a = 6;
    	String test;
    	test = "hello world" + " " + a; 
    	
    	printer p = new printer("this is the constructor");
    	
    	p.helloWorld();
    	
    	a++;
    	
    	test = "hello world" + " " + a; 
        // Prints "Hello, World" to the terminal window.
        System.out.println(test);
        
        for(int i = 0; i < 15; i++)
        {
        	a++;
        	test = "hello world" + " " + a; 
        	 System.out.println(test);
        }
        
        if(a > 20)
        {
        	a = 0; 
        	test = "hello world" + " " + a; 
       	 System.out.println(test);
        }
    }
    
    /*comments      */
    
  

}
