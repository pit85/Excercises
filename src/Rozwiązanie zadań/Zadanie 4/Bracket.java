import java.util.Stack;

public class Bracket {

	public String stringAnswer(boolean answer) {
		if (answer) {
			return "ci�g poprawny";
		} else {
			return "ci�g niepoprawny";
		}
	}

	// Metoda zwracaj�ca true lub false w zale�no�ci od tego czy ci�g jest
	// poprawny
	public boolean isBracketClosed(String inputStr) {

		// Je�li ci�g znak�w jest pusty, funkcja zwraca true
		if (inputStr.isEmpty()) {
			return true;
		}

		// Na stosie przechowuj� ostatni niezamni�ty nawias
		Stack<Character> stack = new Stack<Character>();

		// Dla ka�dego char w ci�gu String sprawdzam czy jest on nawiasem.
		for (int i = 0; i < inputStr.length(); i++) {

			char current = inputStr.charAt(i);

			// Je�li current jest nawiasem otwartym, zostaje on umieszczony na
			// wierzcho�ku stosu
			if (current == '(') {
				stack.push(current);
			}

			// Je�li pierwszy nawias jest zamykajacy, metoda zwraca false
			if (current == ')') {

				if (stack.isEmpty()) {
					return false;
				}

				// Je�li current jest nawiasem zamykaj�cym a nawias na
				// wierzcho�ku stosu otwiera wyra�enie to zostaje on zdj�ty ze
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
