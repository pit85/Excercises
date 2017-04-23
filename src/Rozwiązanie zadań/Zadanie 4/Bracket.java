import java.util.Stack;

public class Bracket {

	public String stringAnswer(boolean answer) {
		if (answer) {
			return "ci¹g poprawny";
		} else {
			return "ci¹g niepoprawny";
		}
	}

	// Metoda zwracaj¹ca true lub false w zale¿noœci od tego czy ci¹g jest
	// poprawny
	public boolean isBracketClosed(String inputStr) {

		// Jeœli ci¹g znaków jest pusty, funkcja zwraca true
		if (inputStr.isEmpty()) {
			return true;
		}

		// Na stosie przechowujê ostatni niezamniêty nawias
		Stack<Character> stack = new Stack<Character>();

		// Dla ka¿dego char w ci¹gu String sprawdzam czy jest on nawiasem.
		for (int i = 0; i < inputStr.length(); i++) {

			char current = inputStr.charAt(i);

			// Jeœli current jest nawiasem otwartym, zostaje on umieszczony na
			// wierzcho³ku stosu
			if (current == '(') {
				stack.push(current);
			}

			// Jeœli pierwszy nawias jest zamykajacy, metoda zwraca false
			if (current == ')') {

				if (stack.isEmpty()) {
					return false;
				}

				// Jeœli current jest nawiasem zamykaj¹cym a nawias na
				// wierzcho³ku stosu otwiera wyra¿enie to zostaje on zdjêty ze
				// stosu
				char last = stack.peek();
				if (current == ')' && last == '(')
					stack.pop();
				else
					return false;
			}

		}

		return stack.isEmpty();

	}

}
