package abc;

public class FindNumFromString {

	public static void main(String[] args) {

		String str="zz183yhABCDWJSjsdg//+&68jhahbdj@#$%^&da873821738738h";
		
        str = str.replaceAll("[^a-zA-Z]", ""); // regular expression
        
//        str = str.replaceAll(" ", "");
        
		System.out.println(str);
	}

}
