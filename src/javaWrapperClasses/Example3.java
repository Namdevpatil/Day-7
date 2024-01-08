package javaWrapperClasses;

public class Example3 {

	public static void main(String[] args) {
		
		byte age = 20;//simple primitive value
		
		//Byte byteObject = age;
		
		Byte byteObject = Byte.valueOf(age);//Byte object type value
		
		int intValue = byteObject.intValue();
		
		System.out.println(intValue);
		
		System.out.println("===============================");
		
		
		
	}
	
}
