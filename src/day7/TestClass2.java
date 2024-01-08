package day7;

public class TestClass2 {

	public static void main(String[] args) {

		//general way of creating an object, using 'new' keyword
		Patient patient1 = new Patient(190, "ABC", "Kidney Problem", "Hyderabad");
		System.out.println(patient1.hashCode());

		System.out.println("-----------------------------------------------------------");

		Patient patient2 = new Patient(188, "ABC", "Kidney Problem", "Hyderabad");
		System.out.println(patient2.hashCode());

		System.out.println("-----------------------------------------------------------");

		Patient patient3 = patient1;
		System.out.println(patient3.hashCode());
		
		System.out.println("-----------------------------------------------------------");

		System.out.println(patient3.getClass().getSimpleName());
		
		System.out.println("-----------------------------------------------------------");

		System.out.println(patient3.equals(patient2));
		
		System.out.println("-----------------------------------------------------------");

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
