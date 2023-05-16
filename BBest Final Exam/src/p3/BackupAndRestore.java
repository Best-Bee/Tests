package p3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BackupAndRestore {
	private static final int ARRAY_MAX = 4;
	public static void Backup() {
		File file = new File("BookData/textbook_titles.txt");
		ArrayList<String> bookList = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(file);
			for(int i = 0; i < ARRAY_MAX; i++) {
				String line = scanner.nextLine();
				bookList.add(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fos = new FileOutputStream("BookData/fiveBooksArrayList.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bookList);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void Restore() {
		ArrayList<String> twoBookList = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("BookData/fiveBooksArrayList.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> bookList = (ArrayList<String>) ois.readObject();
			twoBookList.add(0, bookList.get(0));
			twoBookList.add(1, bookList.get(1));
			ois.close();
			for (int i = 0; i < 2; i++) {
				System.out.println("Book " + (i + 1) + ": " + twoBookList.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
