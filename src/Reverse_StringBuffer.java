
public class Reverse_StringBuffer {



public static void main(String[] args) {
	String origin="Dmitry Nakhabtsev is the best software engineer";

	StringBuffer string_buffer=new StringBuffer(origin);
	String reverse=string_buffer.reverse().toString();

	System.out.println("Reverse: "+reverse);
}
}