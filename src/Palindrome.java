import java.util.SortedSet;
import java.util.TreeSet;

public class Palindrome {

	private SortedSet<Integer> palindromes = new TreeSet<Integer>();

	public void start(int startInt, int endInt) {

		for (int i = startInt; i <= endInt; i++) {

			for (int j = startInt; j <= endInt; j++) {

				if (checkIfPalindrome(i * j)) {
					palindromes.add(i * j);

				}

			}

		}

		System.out.println(palindromes);
	}

	public boolean checkIfPalindrome(int num) {
		int n = num;
		// wzór sprawdzajacy czy liczba jest palindromem
		int rev = 0;
		while (num > 0) {
			int dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10;
		}

		if (n == rev) {
			return true;
		} else {
			return false;
		}

	}

}
