// Import the File class
// Import this class to handle errors
import java.io.*;
import java.awt.*;
import java.awt.event.*;
// Import the Scanner class to read text files
import java.util.*;
import java.util.List;
import java.util.stream.Stream;



public class ReadFile {
  public static void main(String[] args) throws IOException {
	       String outputName = "Output.txt";
           String path = "text2.txt";
           File outPut = new File(outputName);
           
	       File file = new File(path);
	       if(file.exists())
	       {

	        FileReader fileReader = null;
			try {
				fileReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fileReader);
				Stream<String>  lineList = br.lines();  //Read a line
				String[] lineArray = (String[]) lineList.toArray();
				List<String>  outNList = new ArrayList();
				List<String>  outDList = new ArrayList();
				String read = "";       
		        for(int i = 0; i < lineArray.length; i++ )
		        {
		        	
		        read = lineArray[i];
		        String name = isNumeric.getName(isNumeric.lineSplit(read));
		        String date = isNumeric.getDate(isNumeric.lineSplit(read));

		        if(name.contains("-U"))
		        {
		        	name = formatter.stringConverter(name);
		            date = formatter.dateConverter(date);
		        }
		        else
		        {
		        	name =formatter.titleCaseConverterU(name);
		        	date =formatter.dateConverter(date);
		        }
		        outNList.add(i , name);
		        outDList.add(i , date);
		        
		        }
		        PrintWriter outFile = new PrintWriter(outPut);
		        for(int i = 0; i <= outNList.size(); i++)
		        {
		        	
		      
		        outFile.format("%-22s %10s\n", outNList.get(i), outDList.get(i));
		        outFile.flush();
		        }
		        outFile.close();
			    } 
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
	       }
	       else 
	       {

	       System.out.print("Not Found");
	       }
	  }
    }


	


