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
	
		/*****************
		Original Idea for Enigma dials wouldn't work. 
		It would only scramble each letter in the same way each time, when it needs to be scrambled differently with each "wheel" turn.
		 *
		 * A potential better solution is to use offsets and a decryption mode to reverse the offsets in order to make the wheels turn
		 */

		
		message = Dial1(message);
	}
	static String Dial1(String offset1)
	{
		return"";
	}
	static String Dial2(String offset2)
	{
		return"";
	}
	static String Dial3(String offset3)
	{
		return"";
	}
}
