package abc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHome {

	public static void main(String[] args) {

		Set s = new HashSet();

		revString("i love my india");

//		occOfnum("sssddffggh");

//		subsetOfString("abc");

		revNumber(234);
		primeNumbers(7);

	}

	private static void primeNumbers(int num) {

		int m = 0, flag = 0;
		m = num / 2;

		if (num == 0 || num == 1) {

			System.out.println("No Prime Number");
		} else {

			for (int i = 2; i <= m; i++) {

				if (num % i == 0) {

					System.out.println("No Prime Number");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {

				System.out.println("Prime number");
			}

		}

	}

	private static void revNumber(int i) {

		int rev = 0;

		while (i != 0) {

			int reminder = i % 10;
			rev = rev * 10 + reminder;
			i = i / 10;

		}

		System.out.println(rev);
	}

	private static void subsetOfString(String str) {

		for (int i = 0; i <= str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				System.out.println(str.substring(i, j));
			}
		}

	}

	private static void occOfnum(String str) {

		String mainStr = str.toUpperCase();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = mainStr.length() - 1; i >= 0; i--) {

			if (map.containsKey(mainStr.charAt(i))) {

				int count = map.get(mainStr.charAt(i));
				map.put(mainStr.charAt(i), ++count);

			} else {

				map.put(mainStr.charAt(i), 1);

			}

		}

		System.out.println(map);

	}

	private static void revString(String str) {

		String rev = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			char a = str.charAt(i);
			rev = a + rev;

		}

		System.out.println(rev);

	}

}
