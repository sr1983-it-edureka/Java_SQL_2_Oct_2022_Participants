package defaultt.interfaces.demo3;

import thirdpartylib.TPInterface;

public class HouseImpl implements House, TPInterface{

	@Override
	public void build() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeOnwership() {
		
		System.out.println("Go to Govt Office");
		System.out.println("Apply for katha, e-Katha..");
		System.out.println("Change the name to the new owner");
		// TODO Auto-generated method stub
		
	}

	public void appointAssistant() {
//		System.out.println("Cuustom Implementation");
		
//		House.super.appointAssistant();
		
		TPInterface.super.appointAssistant();
	}
}
