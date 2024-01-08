package javaArrays;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {


		String employeeNames[][] = { {"Ajay", "Rakesh", "Ganesh"}, {"Vani", "Gyan", "Kumar"}};//table(row x columns)
		//2x3 = 6 values

		//print in matrix format
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rows: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter colums: ");
		int colums = scanner.nextInt();
		
		scanner.close();
		
		//rows
		for(int i = 0; i < rows; i++)
		{
			//columns
			for(int j = 0; j < colums; j++)
			{
				System.out.print(employeeNames[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
		System.out.println("==================================");
		

	}

}
