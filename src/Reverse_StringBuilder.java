
public class Reverse_StringBuilder {

	public static void main(String[] args) {
		String origin="Dmitry Nakhabtsev is the best software engineer";
		StringBuilder string_builder=new StringBuilder();

		char[] origin_char=origin.toCharArray();
		for(int i=origin_char.length-1;i>=0;i--){string_builder.append(origin_char[i]);	}
		
		String reverse=string_builder.toString();
		System.out.println("Original: "+origin);
		System.out.println("Reverse: "+reverse);
	}
	}
