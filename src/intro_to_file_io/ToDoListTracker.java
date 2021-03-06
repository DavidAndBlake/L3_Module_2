package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	// private File saveFile = new File(null);
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
		save.addActionListener(this);
		load.addActionListener(this);
		frame.setSize(900, 700);
		panel.add(label);
		// panel.setBackground(Color.TRANSLUCENT);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		ArrayList<String> labelList = new ArrayList<String>();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addTask) {
			ArrayList taskArray = new ArrayList();
			String task = JOptionPane.showInputDialog("What task do you want to add?");
			if (task != "" || task != null) { // Tried to prevent user from entering blank strings. Couldn't accomplish
												// the task.
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
			int removeNumber = Integer.parseInt(removeTask);
			labelList.remove(removeNumber - 1);
			String currentText = "<html>";
			for (int i = 0; i < labelList.size(); i++) {
				currentText += labelList.get(i) + "<br>";
			}
			currentText += "</html>";
			System.out.println(currentText);
			label.setText(currentText);
		}
		if (e.getSource() == save) {
			String fileName = JOptionPane.showInputDialog("What would you like to save this file as?");
			try {
				writeFile(fileName);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == load) {
			String read = JOptionPane.showInputDialog("Which file would you like to load?");
			try {
				BufferedReader br = new BufferedReader(new FileReader(read));

				String line = br.readLine();
				while (line != null) {
					labelList.add(line);
					line = br.readLine();
				}
				String currentText = "<html>";

				for (int i = 0; i < labelList.size(); i++) {
					currentText += labelList.get(i) + "<br>";
				}
				currentText += "</html>";
				label.setText(currentText);
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException j) {
				// TODO Auto-generated catch block
				j.printStackTrace();
			}
		}
	}

	public void writeFile(String fileName) throws IOException {
		File file = new File(fileName);
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		for (int i = 0; i < labelList.size(); i++) {
			out.write(labelList.get(i) + "\n");
		}
		// out.write(labelList.toString());
		out.close();
	}
}
