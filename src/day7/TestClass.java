package day7;

public class TestClass {

	public static void main(String[] args) {
		
		//general way of creating an object, using 'new' keyword
		Patient patient1 = new Patient(190, "ABC", "Kidney Problem", "Hyderabad");
		System.out.println(patient1.toString());
		
		Patient patient2 = new Patient(390, "XYZ", "Kidney Problem", "Hyderabad");
		
		System.out.println(patient2.toString());

	}

}
