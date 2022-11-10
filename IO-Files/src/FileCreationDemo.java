import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreationDemo {

	public static void main(String[] args) {
		
		String newFile = "mynewfile.txt";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(newFile);
			
			String message = "I am writing some contents to the file";
			
			for (int index = 0; index < message.length(); index ++) {
				
				char aCharacter = message.charAt(index);
				try {
					fos.write((int)aCharacter);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
