package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encryption {

	public static void main(String[] args) {

		letsEncryptSomething();
	}

	static void letsEncryptSomething() {
		String word = "David";
		String result = "";
		char[] name = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			name[i] += 2;
			result += name[i];
		}
		System.out.println(result);
		String encryptReadyMessage = JOptionPane.showInputDialog("What would you like to encrypt?");
		String otherString = new String();
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/davidswritingtest.txt");
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			
			fw.write(encryptReadyMessage);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
