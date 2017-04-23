import java.util.Arrays;
import java.util.Scanner;

public class MorseCodeTranslator {

	String[] letters = { "A", "•", "B", "C", "∆", "D", "E", " ", "F", "G", "H", "I", "J", "K", "L", "£", "M", "N", "—",
			"O", "”", "P", "Q", "R", "S", "å", "T", "U", "V", "W", "X", "Y", "Z", "Ø", "è", "0", "1", "2", "3", "4",
			"5", "6", "7", "8", "9" };

	String[] morse = { ".-", // A
			".-.-", // •
			"-...", // B
			"-.-.", // C
			"-.-..", // ∆
			"-..", // D
			".", // E
			"..-..", //  
			"..-.", // F
			"--.", // G
			"....", // H
			"..", // I
			".---", // J
			"-.-", // K
			".-..", // L
			".-..-", // £
			"--", // M
			"-.", // N
			"--.--", // —
			"---", // O
			"---.", // ”
			".--.", // P
			"--.-", // Q
			".-.", // R
			"...", // S
			"...-...", // å
			"-", // T
			"..-", // U
			"...-", // V
			".--", // W
			"-..-", // X
			"-.--", // Y
			"--..", // Z
			"--..-.", // Ø
			"--..-", // è
			"-----", // 0
			".----", // 1
			"..---", // 2
			"...--", // 3
			"....-", // 4
			".....", // 5
			"-....", // 6
			"--...", // 7
			"---..", // 8
			"----." // 9
	};

	private Scanner scanner;

	// Metoda pobierajπca od uøytkownika ciπg znakÛw do zakodowania lub
	// odkodowania
	public String inputText() {

		while (true) {

			System.out.println("Wprowadü kod Morse'a lub ciπg znakÛw, ktÛre chcesz zakodowaÊ. \nIn:");

			scanner = new Scanner(System.in);

			String textToTranslate = scanner.nextLine();

			if ((checkIfText(textToTranslate.replaceAll("\\s", "").toUpperCase()))
					|| (checkIfMorseCode(textToTranslate))) {
				return textToTranslate;
			} else {
				System.out.println(
						"Wprowadzony test jest niepoprawny. Wprowadü dowolny kod Morse'a oddzielany spacjami, znaki alfabetu ≥aciÒskiego lub liczby. \n");
			}

		}

	}

	// Metoda odkodowujaca lub kodujπca ciπg znakÛw na kod Morse'a
	public void startTranslation(String textToTranslate) {
		String output = null;

		// Tekst wprowadzony przez uøytkownika jest zamieniany na duøe litery
		// oraz usuwane sπ z niego wszystkie spacje
		if (checkIfText(textToTranslate.replaceAll("\\s", "").toUpperCase())) {

			output = textToMorse(textToTranslate.replaceAll("\\s", "").toUpperCase());

		}

		if (checkIfMorseCode(textToTranslate)) {

			output = morseCodeToText(textToTranslate);

		}

		System.out.print("OUT: ");
		System.out.print(output);
	}

	// Metoda sprawdzajπca czy wszystkie wprowadzone znaki zawierajπ alfabet
	// ≥aciÒski lub liczby
	public boolean checkIfText(String inputStr) {

		int check = 0;
		String[] textArray = inputStr.split("");

		for (int i = 0; i < textArray.length; i++) {
			String letter = textArray[i];
			for (int index = 0; index < letters.length; index++) {

				if (letters[index].equals(letter)) {
					check += 1;
				}
			}
		}

		if (check == textArray.length) {
			return true;
		} else {
			return false;
		}
	}

	// Metoda sprawdzajπca czy wprowadzony ciπg znakÛw zawiera wy≥πcznie kod
	// Morse'a
	public boolean checkIfMorseCode(String inputStr) {

		int check = 0;
		String[] codeArray = inputStr.split(" ");

		for (int i = 0; i < codeArray.length; i++) {
			String morseLetter = codeArray[i];
			for (int index = 0; index < morse.length; index++) {

				if (morse[index].equals(morseLetter)) {
					check += 1;
				}
			}
		}

		if (check == codeArray.length) {
			return true;
		} else {
			return false;
		}
	}

	// Metoda kodujπca tekst jako kod Morse'a
	public String textToMorse(String inputStr) {

		String morseCode = "";

		String[] textArray = inputStr.split("");

		for (int i = 0; i < textArray.length; i++) {

			String letter = textArray[i];

			for (int index = 0; index < letters.length; index++) {

				if (letters[index].equals(letter)) {
					morseCode += (morse[index] + " ");
				}
			}
		}

		return morseCode;
	}

	// Metoda odkodowujπce kod Morse'a
	public String morseCodeToText(String inputStr) {

		String text = "";

		String[] codeArray = inputStr.split(" ");

		for (int i = 0; i < codeArray.length; i++) {

			String morseLetter = codeArray[i];

			for (int index = 0; index < morse.length; index++) {

				if (morse[index].equals(morseLetter)) {
					text += (letters[index]);
				}
			}
		}

		return text;
	}

}
