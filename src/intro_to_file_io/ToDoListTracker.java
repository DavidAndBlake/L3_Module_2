package intro_to_file_io;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoListTracker {

	// Create a window with four buttons: add task, remove task, save, and load.
	// The add task button will display a JOptionPane to get a task from the user
	// and add it to the list.
	// Remove task will remove a task from the list. You can choose your own method
	// of how to select a task from the list.
	// The save button will save the current task list to a file.
	// The load button will load a new task list into the program and display it.
	// The program should automatically load the last saved list from the file at
	// startup and display it.
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		frame.add(button);
		frame.setSize(900, 700);
		panel.add(Text())
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		String Task = JOptionPane.showInputDialog("");
	}
}
