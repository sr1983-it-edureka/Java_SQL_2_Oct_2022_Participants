import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationRetrievalDemo {

	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("persons-v2.obj");
			ois = new ObjectInputStream(fis);

			Person person1 = (Person)ois.readObject();
			person1.display();
			
			Person person2 = (Person)ois.readObject();
			person2.display();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (ois != null) {
				
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
