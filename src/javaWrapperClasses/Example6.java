package javaWrapperClasses;

public class Example6 {

	public static void main(String[] args) {
		
		int intValue = 390;
		byte byteValue = 67;
		
		//up casting
		double count = intValue+byteValue;//we are gaining value
		
		System.out.println(count);
		
		System.out.println("=======================");
		
		double value1 = 456.78, value2 = 367.67;
		
		//down casting
		int sub = (int)(value1-value2);//loosing the some value
		
		System.out.println(sub);
			
	}

}
