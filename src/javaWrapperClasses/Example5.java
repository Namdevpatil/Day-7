package javaWrapperClasses;

public class Example5 {

	public static void main(String[] args) {
		
		int intValue = 390;//Take support of Wrapper class
		
		String stringValue = String.valueOf(intValue);
		
		System.out.println(stringValue);
		
		System.out.println(stringValue.getClass().getSimpleName());
		
		System.out.println("===============to integer===================");
		
		double toIntValue = Double.parseDouble(stringValue);
		
		System.out.println(toIntValue);

	}

}
