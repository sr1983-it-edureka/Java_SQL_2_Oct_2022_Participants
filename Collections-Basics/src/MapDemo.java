import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		// {Key, Value} -> KeyValuePair
		// {1234, Google Chrome}
		// {6287, Windows Explorer}
		// {789}, Firefox
		// {345} Eclipse
		// {1234, MongoDB}
		
		//"hash" -> insertion order / ordering will not be maintained
		HashMap<Integer, String> processes = new HashMap<>();
		
		processes.put(1234, "Google Chrome");
		processes.put(6287, "Windows Explorer");
		processes.put(789, "Firefox");
		processes.put(345, "Eclipse");
	
//		basicOperations(processes);
//		printKeys(processes);
//		printValues(processes);
		
//		printKeyAndValuesv1(processes);
		printKeyAndValuesv2(processes);
	}
	
	static void basicOperations(HashMap<Integer, String> processes) {
		
		String value = processes.get(345);
		System.out.println("Value is " + value);
		
		value = processes.get(1111);
		System.out.println("Value is " + value);
		
		boolean keyPresent = processes.containsKey(789);
		System.out.println("Key Present ?" + keyPresent);		
	}
	
	static void printKeys(HashMap<Integer, String> processes) {
		
		Iterator<Integer> iterator = processes.keySet().iterator();
		
		while (iterator.hasNext()) {
			
			int key = iterator.next();
			System.out.println("Key is " + key);
		}
	}
	
	static void printValues(HashMap<Integer, String> processes) {
		
		Iterator<String> iterator = processes.values().iterator();
	
		while (iterator.hasNext()) {
			
			String processName = iterator.next();
			System.out.println("value is " + processName);
		}
	}
	
	static void printKeyAndValuesv1(HashMap<Integer, String> processes) {
		
		Iterator<Integer> iterator = processes.keySet().iterator();
		
		while (iterator.hasNext()) {
			
			int processId = iterator.next();			
			String processName = processes.get(processId);
			
			System.out.println(String.format(
				"Key is %d and Value is %s", processId, processName));
		}
	}


	static void printKeyAndValuesv2(HashMap<Integer, String> processes) {
		
		Iterator<Map.Entry<Integer, String>> iterator 
			= processes.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
			Map.Entry<Integer, String> entry
				= iterator.next();
			
			int processId = entry.getKey();
			String processName = entry.getValue();
			
			
			System.out.println(String.format(
				"Key is %d and Value is %s", processId, processName));
		}
	}

}
