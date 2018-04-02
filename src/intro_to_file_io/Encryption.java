package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encryption {

	public static void main(String[] args) {

		letsEncryptSomething();
	}

	static void letsEncryptSomething() {
		String encryptReadyMessage = JOptionPane.showInputDialog("What would you like to encrypt?");
		String result = "";
		char[] messageArray = encryptReadyMessage.toCharArray();
		for (int i = 0; i < encryptReadyMessage.length(); i++) {
			messageArray[i] += 2;
			result += messageArray[i];
		}
		System.out.println(result);

		String otherString = new String();
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/davidswritingtest.txt");

			/*
			 * NOTE: To append to a file that already exists, add true as a second parameter
			 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
			 * FileWriter("src/intro_to_file_io/test2.txt", true);)
			 */

			fw.write(encryptReadyMessage);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String newVaria = new String();
		for (int i = 0; i < encryptReadyMessage.length(); i++) {
			otherString += (int) encryptReadyMessage.charAt(i);
			// System.out.println(otherString);
			switch (i) {
			case 97:
				i += 3;
				break;

			// default:
			// break;
			}
		}
	}
}
