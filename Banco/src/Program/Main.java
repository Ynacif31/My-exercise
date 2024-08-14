package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bank;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Bank bank;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        
        if(response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(number, holder, initialDeposit);
        }else {
        	bank = new Bank(number, holder);
        	
        }
        
        System.out.println("Account data: ");
    	System.out.println(bank);
        
        System.out.print("Enter a deposit value:");
        double initialDeposit = sc.nextDouble();
        bank.deposit(initialDeposit);
        System.out.println("Updated account data: ");
        System.out.println(bank);
        
        System.out.print("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        bank.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bank);
	
		

		sc.close();
	}

}
