package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class decyptor {


		private void decryptors() {
			String wut;
			lut =
			for(int i=0; i<wut.length() ; i++) {
				
				
			}
			JOptionPane.showMessageDialog(null, wut);
			wut=wut.replace('a', '!');
			wut=wut.replace('i', '@');
			wut=wut.replace('o', '#');
			wut=wut.replace('u', '$');
			wut=wut.replace('e', '%');
			JOptionPane.showMessageDialog(null, wut);
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/cryptor.txt");
				fw.write(wut);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("error");
			}
			
		}
	

}
