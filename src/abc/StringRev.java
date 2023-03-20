package abc;

public class StringRev {

	
	public static void StringRev(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char a = str.charAt(i);
			rev =rev+a;
		}

		System.out.println(rev);

	}
	
	public static void main(String[] args) {

		StringRev("aditya");
		StringRev("shinde");


	}

}
