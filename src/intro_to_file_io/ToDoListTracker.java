package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoListTracker implements ActionListener {

	// Create a window with four buttons: add task, remove task, save, and load.
	// The add task button will display a JOptionPane to get a task from the user
	// and add it to the list.
	// Remove task will remove a task from the list. You can choose your own method
	// of how to select a task from the list.
	// The save button will save the current task list to a file.
	// The load button will load a new task list into the program and display it.
	// The program should automatically load the last saved list from the file at
	// startup and display it.
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addTask = new JButton();
	JButton removeTask = new JButton();
	JButton save = new JButton();
	JButton load = new JButton();
	JLabel label = new JLabel();
	ArrayList<String> labelList = new ArrayList<>();
	boolean isEmpty;

	public static void main(String[] args) {
		new ToDoListTracker();
	}

	public ToDoListTracker() {
		// TODO Auto-generated constructor stub
		addTask.setText("Add Task");
		removeTask.setText("Remove Task");
		save.setText("Save");
		load.setText("Load");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addTask);
		panel.add(removeTask);
		panel.add(save);
		panel.add(load);
		addTask.addActionListener(this);
		removeTask.addActionListener(this);
		frame.setSize(900, 700);
		panel.add(label);
		// panel.setBackground(Color.TRANSLUCENT);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		ArrayList<String> labelList = new ArrayList<String>();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addTask) {
			String task = JOptionPane.showInputDialog("What task do you want to add?");
			if (task != "" || task != null) { // Tried to prevent user from entering blank strings. Couldn't accomplish the task.
			labelList.add(task);
			String currentText = "<html>";
			
				for (int i = 0; i < labelList.size(); i++) {
					currentText += labelList.get(i) + "<br>";
				}
				currentText += "</html>";
				System.out.println(currentText);
				label.setText(currentText);
			}
		}
		if (e.getSource() == removeTask) {
			String removeTask = JOptionPane.showInputDialog("What is the number of the task do you want to remove?");

			for (int i = 0; i < labelList.size(); i++) {
				if (removeTask == labelList.get(i)) {
					labelList.remove(i);
				}
			}
			String currentText = "<html>";
			
			for (int i = 0; i < labelList.size(); i++) {
				currentText += labelList.get(i) + "<br>";
			}
			currentText += "</html>";
			System.out.println(currentText);
			label.setText(currentText);
		}
	}
}
