
public class Reverse_Recursively {
	
	public static String reverse(String str){
		if(str.length()<2){return str;}
		String reversed=reverse(str.substring(1))+str.charAt(0);
/*		
		charAt(int index), Returns the char value at the specified index.
		substring(int beginIndex) Returns a new string that is a substring of this string.
		Examples:
			 "unhappy".substring(2) returns "happy"
			 "Harbison".substring(3) returns "bison"
			 "emptiness".substring(9) returns "" (an empty string)
*/		
		return reversed;
	}
	
public static void main(String[] args) {
	String origin="Dmitry Nakhabtsev is the best software engineer";
	System.out.println("Reverse: "+reverse(origin));
}
}
