package javaWrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();
		
		values.add(123);
		values.add(309);
		//values.add(234.45f);
		values.add(null);
		//values.add("Hello");
		//values.add(true);
		
		System.out.println(values);
		
		System.out.println("=====================salaries=====================");
		
		List<Double> salaries = new ArrayList<Double>();
		
		salaries.add(98239.88);
		salaries.add(83928.67);
		//values.add(234.45f);
		salaries.add(43928.34);
		//values.add("Hello");
		//values.add(true);
		
		System.out.println(salaries);
		

	}

}
