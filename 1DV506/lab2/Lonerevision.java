package ol222es_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lonerevision {

	public static void main(String[] args) {
				
		int median = 0, middle = 0, averageSalary = 0, wageDistribution = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		System.out.print("Mata in löner (och avsluta med 'X'): ");
		
		while(input.hasNextInt()) {
			salaries.add(input.nextInt());
		}
		
		Collections.sort(salaries);						

		//Median
		middle = salaries.get(salaries.size()/2);
		if (salaries.size() % 2 == 1) {						 
			median = middle;
		} else {
			median = (middle + (salaries.get(salaries.size()/2 - 1)))/2;
		} 
		
		
		//Avarage salary
		averageSalary = 0;
		for (int i = 0; i < salaries.size(); i++) {
			int temp = salaries.get(i);
			averageSalary = averageSalary + temp;
		}
		averageSalary = averageSalary / salaries.size();

		//Wage distribution
		wageDistribution = 0;
		wageDistribution = salaries.get(salaries.size() - 1) - salaries.get(0);
		
		System.out.println(median);
		System.out.println(averageSalary);
		System.out.println(wageDistribution);
		input.close();
		
	}

}
