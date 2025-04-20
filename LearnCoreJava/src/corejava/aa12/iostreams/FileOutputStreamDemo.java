package corejava.aa12.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(new File("C:\\Learn_Java\\LearnCoreJava\\files\\wallpaper.jpg"));
			fos = new FileOutputStream(new File("C:\\Learn_Java\\LearnCoreJava\\files\\wallpaper_copy.jpg"));
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
