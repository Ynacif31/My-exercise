package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.setName(sc.nextLine());
		System.out.print("Gross salary: ");
		employee.setgrossSalary(sc.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println("Employee: " + employee.getName() + ", $ " + String.format("%.3f", employee.netSalary()));
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Updated data: " + employee.getName() + ", $ " + String.format("%.2f", employee.netSalary()));
		
		
		sc.close();
	}

}
