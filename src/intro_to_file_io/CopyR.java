package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class CopyR extends cryptor {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("src/intro_to_file_io/g.java");
	fw.write("\n //Copyright © 2017 by Bill Jobs");
	fw.close();
}
	public CopyR() {
		
	}

}
