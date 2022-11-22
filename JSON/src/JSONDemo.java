import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONDemo {

	public static void main(String[] args) throws Exception{
		
		writeJSON();
		
		readJSON();
	}
	
	static void writeJSON() {
		
		JSONObject student1 = new JSONObject();
		
		student1.put("id", "101");
		student1.put("name", "Monisha");
		student1.put("course", "Computer Science");
		
//		System.out.println(student1.toJSONString());
	}
	
	static void readJSON() throws Exception{
		
		JSONParser parser = new JSONParser();
		
		File fileObj = new File("student.json");
		
		FileReader reader = new FileReader(fileObj);

		Object object = parser.parse(reader);

//		System.out.println(object);		
		
		if (object instanceof JSONObject) {
			
			JSONObject jsonObj = (JSONObject)object;
			
			Iterator<String> iterator = jsonObj.keySet().iterator();
			
			while (iterator.hasNext()) {
				
				String attributeName = iterator.next();
			
				String attributeValue = (String)jsonObj.get(attributeName);
			
				System.out.println(attributeName + "->" + attributeValue);
			}
		}
	}
}
