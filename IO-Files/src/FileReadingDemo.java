import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		
		String filename = "/home/labuser/java_sql_2/git/Java_SQL_2_Oct_2022_Participants/IO-Files/sample.txt";
		File fileObj = 
			new File(filename);
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileObj);
			
			try {
				
				while (true) {
				
					int data = fis.read();
					if (data == -1) {
						//End of file
						break;
					}
					char content = (char)data;
										
					System.out.print(content);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  finally {
			try {
				if (fis != null) {
					fis.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
