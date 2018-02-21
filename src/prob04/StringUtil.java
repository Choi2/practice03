package prob04;

public class StringUtil {
	public static String concatenate( String[] str ) {
		String result = "";
		for(String word : str) {
			result += word;
		}
		return result;
	}
	
}
