import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
 
//Method use for both name and date altering
public class formatter {
	/* change name to caputiliesd first letter
	 *  and capitilises solo charecters */
	public static String stringConverter(String n) 
	{
		if (n == null || n.isEmpty()) {
			return n;
		}
		StringBuilder titleCase = new StringBuilder();
		boolean isCap = true;
		for (char charr : n.toCharArray()) {
			if (Character.isSpaceChar(charr)) {
				isCap = true;
			} else if (isCap) {
				charr = Character.toTitleCase(charr);
				isCap = false;
			} else {
				charr = Character.toLowerCase(charr);
			}
			titleCase.append(charr);
		}

		
		String formattedName = titleCase.toString();
		String[] nameComponent = formattedName.split(" ");


		switch (nameComponent.length) {
			
			case 3:	
				nameComponent[1] = nameComponent[1] + ".";

				// Rebuild the full name.
				formattedName = "";
				for (String nameC : nameComponent) {
					formattedName = formattedName + nameC + " ";
				}

				// Return the formatted name.
				return formattedName.trim();
			default:
				// Return the formatted name.
				return formattedName;
		}
	}

	// Formats name with -U flag.
	public static String titleCaseConverterU(String n) 
	{
		if (n == null || n.isEmpty()) {
			return n;
		}

	
		String formattedName = n.toUpperCase();

	
		String[] nameComponent = isNumeric.lineSplit(formattedName);

		switch (nameComponent.length) {
		case 3:
			// Add a full stop to single initial for middle name
			nameComponent[1] = nameComponent[1] + ".";

			// Rebuild the full name.
			formattedName = "";
			for (String nameC : nameComponent) {
				formattedName = formattedName + nameC + " ";
			}

			// sends out the formatted name.
			return formattedName.trim();
		}
		// Return the formatted name.
		return formattedName;
	}

	// Formats date to dd/MM/yyyy format.
	public static String dateConverter (String s)
	{
		if (s == null || s.isEmpty()) {
			return s;
		}

		SimpleDateFormat parser = new SimpleDateFormat("ddMMyyyy");

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
 
		/*uses the simple date formatter to to set the pattern wanted and the PATTERN GIVEN SWAPPING THE TWO */
		try {
			Date date = parser.parse(s);
			String dateInString = format.format(date);
			return dateInString;
		} catch (ParseException e) {e.printStackTrace();}
		return null;
	}

}
