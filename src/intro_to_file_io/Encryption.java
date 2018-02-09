package intro_to_file_io;

import javax.swing.JOptionPane;

public class Encryption {

	public static void main(String[] args) {
		
		letsEncryptSomething();
	}
	
	static void letsEncryptSomething()
	{
		String word = "David";
		char[]name = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			name[i]+=2;
			System.out.println(name[i]);
		}
		
		String encryptReadyMessage = JOptionPane.showInputDialog("What would you like to encrypt?");
		for (int i = 0; i < encryptReadyMessage.length(); i++) {
			encryptReadyMessage.charAt(i);
			//switch (i) {
			//case value:                                                                                                                                                                                                               
				
			//	break;

			//default:
			//	break;
			}
		}
	}

