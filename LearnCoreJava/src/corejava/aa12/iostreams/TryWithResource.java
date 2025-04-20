package corejava.aa12.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryWithResource {

	public static void main(String[] args) {
		int count = 0;
		try (FileReader fr = new FileReader(new File("C:\\Learn_Java\\LearnCoreJava\\files\\myFile.txt"));
				BufferedReader br = new BufferedReader(fr);) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}

			System.out.println(count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
