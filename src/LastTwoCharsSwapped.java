
public class LastTwoCharsSwapped {
	
	
	public static String lastTwo(String str) {
	    // Check if the input string has at least two characters
	    if (str.length() < 2) {
	        return str;  // If not, return the string as is
	    }

	    // Extract the last two characters
	    String lastTwoChars = str.substring(str.length() - 2);

	    // Swap the last two characters and return the modified string
	    return str.substring(0, str.length() - 2) + lastTwoChars.charAt(1) + lastTwoChars.charAt(0);
	}

	public static void main(String[] args) {
	    // Test cases
	    System.out.println(lastTwo("coding"));  // Output: "codign"
	    System.out.println(lastTwo("cat"));     // Output: "cta"
	    System.out.println(lastTwo("ab"));      // Output: "ba"
	}
	
	   
	}
	
	

