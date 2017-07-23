import java.io.*;

public class ReaderWriter {

	public static Boolean writeStringToFile(String toWrite,String filepath, Boolean appendToFile)
	{
		FileWriter fw = null;
		try {
			fw = new FileWriter(filepath, appendToFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	
}
