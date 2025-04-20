package corejava.aa12.iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(new File("C:\\Learn_Java\\LearnCoreJava\\files\\myfile.txt"));
			fw = new FileWriter(new File("C:\\Learn_Java\\LearnCoreJava\\files\\myfile_new.txt"));

			int i;

			while ((i = fr.read()) != -1) {
				fw.write(i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
