package p2;

public class Demo {

	public static void main(String[] args) {
		String[] arr = ExportAndImport.importBooks("BookData/textbook_titles.txt");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		ExportAndImport.exportBooks(ExportAndImport.importBooks("BookData/textbook_titles.txt"), "data.txt");
	}
}
