package javaArrays;

public class Example4 {

	public static void main(String[] args) {


		String employeeNames[][] = { {"Ajay", "Rakesh"}, {"Vani", "Gyan"}};//table(row x columns)
		//2x2 = 4 values

		//print in matrix format
		
		//rows
		for(int i = 0; i < employeeNames.length; i++)
		{
			//columns
			for(int j = 0; j < employeeNames.length; j++)
			{
				System.out.print(employeeNames[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
		

	}

}
