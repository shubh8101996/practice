package abc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverseWordWise {

	public static void main(String[] args) {

		String str="i like this program very much";
//		
//		String result = Arrays.asList(str.split(" "))
//                .stream()
//                .map(s -> new StringBuilder(s).reverse())
//                .collect(Collectors.joining(" "));
// 
//        System.out.println(result);
		
		  int arr[]= {10, 50, 36,98,12,423,23,4,222,3,4,32,4};
//		   Arrays.sort(arr);
    	   Arrays.sort(arr);

//		   Arrays.stream(arr);
		   for (int i : arr) {
			System.out.println(i);
		}

	}

}
