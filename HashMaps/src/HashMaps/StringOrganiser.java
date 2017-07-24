package HashMaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class StringOrganiser {
	String[] input; 
    HashMap<Integer, String> words = new HashMap<Integer, String>();
    
    
    public StringOrganiser(String[] input)
    {
    	this.input = input; 
    }
	
    
    public String stringSort(String input)
    {
    	char[] chars = input.toCharArray(); 
    	
    	Arrays.sort(chars);
    	
    	return new String(chars);
    }
}
