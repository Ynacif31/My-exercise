package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas numeros você vai digitar: ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		int pares;
		for(int i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				
			}
		}
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				sum++;
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares: " + sum);
	}

}
