package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class ExportAndImport {
	private static Random random = new Random();
	public static String[] importBooks(String fileName) {
		File file = new File(fileName);
		Scanner scanner = null;
		//get line count
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int lineCount = 0;
		while (scanner.hasNextLine()) {
			scanner.nextLine();
			lineCount++;
		}
		scanner.close();
		//get actual data
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String[] arr = new String[lineCount];
		lineCount = 0;
		while (scanner.hasNextLine()) {
			arr[lineCount++] = scanner.nextLine();
		}
		scanner.close();
		return arr;
	}
	
	public static void exportBooks(String[] bookArr, String fileName) {
		try {
			FileWriter fw = new FileWriter("BookData/" + fileName, true);
			PrintWriter pw = new PrintWriter(fw);
			for (String a : bookArr) {
				//number 0 - 19999
				Double temp = (double) (random.nextInt(20000));
				//divide by 100 so now 0 - 199.99
				temp = (temp / 100.0);
				//make sure it's two decimals at most
				double rounded = Math.round(temp * 100.0) / 100.0;
				pw.print(rounded + "\t" + a + "\n");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
