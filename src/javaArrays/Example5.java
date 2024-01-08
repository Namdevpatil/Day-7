package javaArrays;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {


		
		//print in matrix format
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rows: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter colums: ");
		int colums = scanner.nextInt();
		
		//scanner.close();		
		String employeeNames[][] = new String[rows][colums];//table(row x columns)
		//2x3 = 6 values
		
		System.out.println("------------------------------------------------");
		
		System.out.println("\nEnter the array values: ");
		
		//rows
		for(int i = 0; i < rows; i++)
		{
			//columns
			for(int j = 0; j < colums; j++)
			{
				employeeNames[i][j] = scanner.next();
			}
		}
		
		scanner.close();
		
		System.out.println("==================================");
		
		for(int i = 0; i < rows; i++)
		{
			//columns
			for(int j = 0; j < colums; j++)
			{
				System.out.print(employeeNames[i][j]+"\t");
			}
			System.out.println("\n\n");
		}

	}

}
