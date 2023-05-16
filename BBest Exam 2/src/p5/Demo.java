package p5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

public class Demo {
	
	public static void main(String[] args) {
		LinkedList<String> parentList = new LinkedList<String>();
		String test = fileLoader();
		String[] testArray = test.trim().split("\\s+");//	<--------  	//cuts out the spaces essentially and makes
		lyrics(parentList, testArray);									//the whole string into an array
		System.out.println(parentList.toString());
	}
	
	public static void lyrics(LinkedList<String> arr, String[] words) {
		LinkedList<String> uniqueWords = new LinkedList<>();
		
		for(int i = 0; i < words.length; i++){
			if(!(uniqueWords.contains(words[i]))) {
				LinkedList<String> temp = new LinkedList<String>();
				temp.add(words[i]);
				arr.addAll(temp);
				uniqueWords.add(words[i]);
			}
		}
	}
	
	public static String fileLoader() {
		try {
			StringBuilder returnValue = new StringBuilder();
			File file = new File("src/words.txt");
			FileReader re = new FileReader(file);
			BufferedReader br = new BufferedReader(re);
			
			while(br.ready()) {
				returnValue.append(br.readLine() + " ");
			}   
			
			return returnValue.toString();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "load error";
	}
}