package junit.test.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileIO {
	public static void main(){
		FileIO a = new FileIO();
		a.testFileRead(null);
	}

	public int openDialog() {

		JFileChooser fileChooser = new JFileChooser();
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();

		}
		return result;
	}

	
	public String testFileRead(String location){
		Scanner input1 = null;
		try {
			File file1 = new File(location);
			input1 = new Scanner(file1);
			
		} catch (FileNotFoundException  e) {
		} return input1.nextLine();
	}

	public void testFileWrite(String location){
	try {
        FileWriter fw = new FileWriter(location);
        fw.write("test");
        fw.flush();
        fw.close();
     } catch (IOException e){
    	 
     } 
	}
  
}
