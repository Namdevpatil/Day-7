package javaArrays;

public class Example2 {

	public static void main(String[] args) {


		String employeeNames[][] = { {"Ajay", "Rakesh"}, {"Shravani", "Gyan"}};//table(row x columns)
		//2x2 = 4 values

		//rows
		for(int i = 0; i < employeeNames.length; i++)
		{
			//columns
			for(int j = 0; j < employeeNames.length; j++)
			{
				System.out.println(employeeNames[i][j]);
			}
		}
		

	}

}
