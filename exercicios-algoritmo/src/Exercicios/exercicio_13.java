package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_13 {

	public static void main(String[] args) {
			
	// 13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
	//	   seu novo salário, com 15% de aumento.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual o sálario do funcionário? R$ ");
		double salAtual  = sc.nextDouble();
		double aumento = salAtual * 15 / 100;
		double novoSal = salAtual + aumento;
		
		System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
		System.out.printf("Sálario atualizado: R$ %.2f%n", novoSal);
		

	}

}
