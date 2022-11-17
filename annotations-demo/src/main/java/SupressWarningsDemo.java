import java.util.ArrayList;

public class SupressWarningsDemo {

	public static void main(String[] args) {
	
		createArrayList();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static void createArrayList() {
	
		ArrayList list = new ArrayList();
		
		list.add(new String("hello"));
		
		System.out.println(list);
		
	}
	
}
