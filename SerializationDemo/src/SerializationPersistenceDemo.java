import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationPersistenceDemo {

	public static void main(String[] args) {
		
		
		Person gopal = new Person("Gopal", 25, 
			"Indira Nagar, Bangalore", "123$%");
		Person vaishnavi = new Person("Vaishnavi", 24, 
				"Chennai", "789&*");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("persons-v2.obj");
			
			oos = new ObjectOutputStream(fos);

			oos.writeObject(gopal);
			oos.writeObject(vaishnavi);
			
			System.out.println("Objects are persisted...");
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (oos != null) {
				
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
