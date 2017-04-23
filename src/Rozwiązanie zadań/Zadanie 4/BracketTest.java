
public class BracketTest {

	public static void main(String[] args) {

		Bracket bracketTest = new Bracket();

		String inputStr1 = "(a(c)";
		String inputStr2 = ")b";
		String inputStr3 = "(b(s))";
		String inputStr4 = "(((b(s))adafasd))";
		String inputStr5 = "";

		System.out.println(inputStr1 + " - " + bracketTest.stringAnswer(bracketTest.isBracketClosed(inputStr1)));
		System.out.println(inputStr2 + " - " + bracketTest.stringAnswer(bracketTest.isBracketClosed(inputStr2)));
		System.out.println(inputStr3 + " - " + bracketTest.stringAnswer(bracketTest.isBracketClosed(inputStr3)));
		System.out.println(inputStr4 + " - " + bracketTest.stringAnswer(bracketTest.isBracketClosed(inputStr4)));
		System.out.println(inputStr5 + " - " + bracketTest.stringAnswer(bracketTest.isBracketClosed(inputStr5)));

	}

}
