package abc;

public class StringRevWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="i like this program very much";
		String s[] = str.split(" ");
		String ans = "";
		
		for (int i = s.length-1; i >= 0; i--) {
		
			ans =ans+ s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(ans);

	}

}
