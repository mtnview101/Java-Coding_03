
public class Longest_String_Method {

	public static String getLengthLongestString(String[]array){
		int maxLength=0;
		String longestString=null;
		
		for(String s:array){
			if (s.length()>maxLength){
				maxLength=s.length();
				longestString=s;
			}	
	}
	return longestString;
	}
	
	public static void main (String[] args) {
		String[] toppings={"Cheese", "Pepperoni", "Olives"};
		String longestString=getLengthLongestString(toppings);
		System.out.println("Longest string: "+longestString);
	}
	}
