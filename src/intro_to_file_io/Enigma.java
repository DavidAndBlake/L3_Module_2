package intro_to_file_io;

import javax.swing.JOptionPane;

public class Enigma {

	public static void main(String[] args) {
		int randomLetterScrambler = (int) (Math.random() * 26);

		if (randomLetterScrambler < 26) {
			// randomLetterScrambler;
		}
		System.out.println(randomLetterScrambler);

		String message = JOptionPane.showInputDialog("Ready to encrypt sir/madam.");
		dialSettings(message);

	}

	static void dialSettings(String message) {
		message = Dial1(message);
	}

	static String Dial1(String)
	{
		return"";
	}
}
