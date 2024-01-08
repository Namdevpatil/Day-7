package javaWrapperClasses;

public class Example1 {

	public static void main(String[] args) {
		
		byte age = 20;//simple primitive value
		
		//Byte byteObject = age;
		
		Byte byteObject = Byte.valueOf(age);//Byte object type value
		
		System.out.println(byteObject);
		
	}
	
}
