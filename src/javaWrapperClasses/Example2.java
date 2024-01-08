package javaWrapperClasses;

public class Example2 {

	public static void main(String[] args) {
		
		byte a = 20;
		
		Byte byteObject = new Byte(a);//Byte object type value
			
		byte byteValue = byteObject.byteValue();
		
		System.out.println(byteObject);
		
	}
	
}
