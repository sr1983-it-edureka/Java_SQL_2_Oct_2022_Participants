
// Parent / Base / Super class
public class BaseDevice {

	String manufacturer;
	String model;
	String color;

	public BaseDevice(
		String lManufacturer, String lModel, String lColor) {
		
		manufacturer = lManufacturer;
		model = lModel;
		color = lColor;
	}
	
	void display() {
		System.out.println();

		StringBuilder contents = new StringBuilder();
		
		contents.append("Manufacturer ").append(manufacturer).append(",");
		contents.append("Model ").append(model).append(",");
		contents.append("Color ").append(color);
		
		System.out.println(contents.toString());
	}	
}
