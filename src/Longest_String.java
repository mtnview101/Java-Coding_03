
public class Longest_String {
public static void main(String[] args) {
	String input="Cheese Pepperoni Olives Pizza Pepperoni Cheese Pepperoni Nakhabtsev";
	String[] a=input.split(" ");
	int maxLength=0;
	String longestString=null;
	
	for(String s:a){
		if (s.length()>maxLength){
			maxLength=s.length();
			longestString=s;
		}
	}
	System.out.println("Longest string: "+longestString);
}
}
