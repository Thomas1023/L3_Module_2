package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class cryptor {
	public static void main(String[] args) throws IOException {
		cryptor cryptor = new cryptor();
		cryptor.cryptors();
	}
	
	String lut;
	private void cryptors() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/cryptor.txt"));
		
		String lut = br.readLine();

		for(int i=0; i<lut.length() ; i++) {
			
			
		}
		lut=lut.replace('!', 'a');
		lut=lut.replace('@', 'i');
		lut=lut.replace('#', 'o');
		lut=lut.replace('$', 'u');
		lut=lut.replace('%', 'e');
		JOptionPane.showMessageDialog(null, lut);
		
		
	}

}
