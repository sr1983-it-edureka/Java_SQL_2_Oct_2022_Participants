import java.util.List;

public class DeprecationDemo {

	public static void main(String[] args) {
		
		Add add = new Add();
		add.doAdd(20, 30);
	}
	
}

@Deprecated
// Add is deprecated. Dont use Add class, instead use Addv2
class Add{
	
	//  customers - 10
	// Deprecated. New customer can use fetchRecordsv2
	@Deprecated
	List fetchRecords(){
		// modify - optimiziing
		return null;
	}
	
	List fetchRecordsv2() {
		return null;
	}
	
	// doAdd is deprecated. Use the new method add()
	@Deprecated()
	int doAdd(int a, int b) {
		return a +b;
	}

	int add(int a, int b) {
		return a +b;
	}

}
