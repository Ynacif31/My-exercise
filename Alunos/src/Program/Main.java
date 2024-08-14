package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Studant;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant studant = new Studant();
		System.out.print("Whats your name? ");
		studant.setName(sc.nextLine());
		
		System.out.println("Whats are your three grades in the semester? ");
		studant.setGrade1(sc.nextDouble());
		studant.setGrade2(sc.nextDouble());
		studant.setGrade3(sc.nextDouble());

		System.out.print("FINAL GRADE: " +" " + studant.finalGrade());
		if(studant.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.println("Missing: " + studant.missingPoints());
		}else {
			System.out.println("PASS");
			
		}
		
		sc.close();
	}

}
