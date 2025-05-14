package bookshelf;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	public static void writLog(String fileName, String text) {
		FileWriter fileWriter;
		BufferedWriter writer;		
		
		// écriture dans un fichier des valeurs
		try {
			fileWriter = new FileWriter(fileName, true);
			writer = new BufferedWriter(fileWriter);
			writer.write(text+"\n");
			writer.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Fichier non trouvé");
		}
		catch (IOException e) {
			System.out.println("Fichier non accessible");
		}
	}
}
