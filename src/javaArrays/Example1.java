package javaArrays;

public class Example1 {
	
	public static void main(String[] args) {
		
		
		String employeeNames[] = {"Ajay", "Kiran", "Rakesh", "Shravani", "Gyan"};
		
		for(String employeeName: employeeNames)
		{
			System.out.println(employeeName);
			System.out.println("----------------");
		}
		System.out.println("-------**last value of an array**---------");
		
		System.out.println(employeeNames[employeeNames.length-1]);
		
	}

}
