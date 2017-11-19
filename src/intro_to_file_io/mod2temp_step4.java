package intro_to_file_io;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mod2temp_step4 implements ActionListener{
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	JButton Book = new JButton("add task");
	JButton Look = new JButton("remove task");
	JButton Nook = new JButton("save");
	JButton Fook = new JButton("load");
	ArrayList<String> tasks = new ArrayList<String>();
	public static void main(String[] args) {
		mod2temp_step4 GuestBook = new mod2temp_step4();
		GuestBook.setup();
	}
	void setup() {

		
		J.setVisible(true);
		J.add(P);
		
		P.add(Book);
		P.add(Look);
		P.add(Nook);
		P.add(Fook);
		J.pack();
		
		Book.addActionListener(this);
		Look.addActionListener(this);
		Nook.addActionListener(this);
		Fook.addActionListener(this);
	}
//	4. Make a to-do list tracker:
//		Create a window with four buttons: add task, remove task, save, and load.
//		The add task button will display a JOptionPane to get a task from the user and add it to the list.
//		Remove task will remove a task from the list. You can choose your own method of how to select a task from the list.
//		The save button will save the current task list to a file.
//		The load button will load a new task list into the program and display it.
//		The program should automatically load the last saved list from the file at startup and display it.
	   
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton ButtonPressed =  (JButton) e.getSource();
		if(ButtonPressed == Book) {
			tasks.add(JOptionPane.showInputDialog(""));
			
		} if(ButtonPressed == Look) {
			String tempS = "type number of varible you would like to remove \n";
			for (int i = 0; i < tasks.size(); i++) {
				tempS = tempS +" "+ i + ") " +tasks.get(i);
				
			}
			String numS = JOptionPane.showInputDialog(tempS);
			int num = Integer.parseInt(numS); 
			if(num>tasks.size()) {
				JOptionPane.showMessageDialog(null, "error, varible "+num+" does not exist");
			}else {
				tasks.remove(num);
			}
		}
		if(ButtonPressed == Nook) {
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
				for (int i = 0; i < tasks.size(); i++) {
					
					fw.write("\n"+tasks.get(i));
				}
				
					
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}if(ButtonPressed == Fook) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test2.txt"));
			
			String line = br.readLine();
			while(line != null){
				tasks.add(line);
				line = br.readLine();
			}
			} catch (Exception e2) {
							}

		}
		
		
	}
}


