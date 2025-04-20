package corejava.aa12.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File("C:\\Learn_Java\\LearnCoreJava\\files\\myFile.txt"));

			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
