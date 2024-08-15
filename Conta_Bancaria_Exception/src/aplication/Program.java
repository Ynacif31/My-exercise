package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int accountNumber = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String accountHolder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(accountNumber, accountHolder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amountWithdraw = sc.nextDouble();
			account.withdraw(amountWithdraw);
			
			System.out.println(account);
		}
		catch(DomainException e){
			System.out.println("Withdraw error: " + e.getMessage());
			
		}
		catch(RuntimeException e) {
			System.out.println("Sintax error");
		}
		
		sc.close();
	}

}
