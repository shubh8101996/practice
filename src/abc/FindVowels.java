package abc;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="shubham";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) 
		{
//			System.out.println(str.charAt(i));
			count++;
		}
		}

		System.out.println(count);
	}

}
