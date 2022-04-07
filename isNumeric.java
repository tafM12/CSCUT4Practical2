import java.util.*;

// method simply checks if a string is of numeric value so we can correctly split name and date
public class isNumeric {
	public static boolean isNumeric(String str)
	{ 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
	}
	
	public static String getName(String[] arr)
	{
		List<String>  nameList = new ArrayList();
		for(int i = 0; i < arr.length ; i++)
		{
			if (isNumeric(arr[i]) == false)
			{
				nameList.add(arr[i]);
			}
		}
		String name = nameList.toString();
		return name;
		
	}
	public static String getDate(String[] arr)
	{
		List<String>  dateList = new ArrayList();
		for(int i = 0; i < arr.length ; i++)
		{
			if (isNumeric(arr[i]) == true)
			{
				dateList.add(arr[i]);
			}
			
		}
		String date = dateList.toString();
		return date;
		
	}
	
	public static String[] lineSplit(String arr)
	{
		 String[] items = arr.split("\\s+");
		 return items;
		 
		
	}
}
