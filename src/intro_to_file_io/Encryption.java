package intro_to_file_io;

import javax.swing.JOptionPane;

public class Encryption {

	public static void main(String[] args) {

		letsEncryptSomething();
	}

	static void letsEncryptSomething() {
		String word = "David";
		char[] name = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			name[i] += 2;
		}

		String encryptReadyMessage = JOptionPane.showInputDialog("What would you like to encrypt?");
		String otherString = new String();
		for (int i = 0; i < encryptReadyMessage.length(); i++) {
			otherString += (int) encryptReadyMessage.charAt(i);
			System.out.println(otherString);
			switch (i) {
			case 1:
				// break;

				// default:
				// break;
			}
		}
	}
}
