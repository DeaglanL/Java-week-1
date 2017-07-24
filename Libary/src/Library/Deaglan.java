package Library;
import java.io.*;

public class Deaglan {

	public static Boolean writeStringToFile(String toWrite,String filepath, Boolean appendToFile) throws IOException
	{
		FileWriter fw = new FileWriter(filepath, appendToFile);
		PrintWriter pw = new PrintWriter(fw); 
		
		pw.print(toWrite);
		
		
		pw.close();
		return false;
	}
	
	public static String readFileToString(String filePath) throws IOException
	{
		FileReader fr = new FileReader(filePath);
		
		BufferedReader bf = new BufferedReader(fr);
		 
		String output = ""; 
		String line;
		
		while((line = bf.readLine())!=null)
		{
			output = output + line + "\n";
		}
		
		bf.close();
		
		return output;
		
	}
	
	public static Boolean intTryParse(String v)
	{
		try {  
	         Integer.parseInt(v);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }
	}
	
}
