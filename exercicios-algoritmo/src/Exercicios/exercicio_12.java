package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_12 {

	public static void main(String[] args) {
		
// 12) Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL,
//     com 5% de desconto.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.printf("Qual o valor do produto? R$ ");
		double valProduto = sc.nextDouble();
		
		double promo = valProduto * 5 / 100;
		double valFinal = valProduto - promo;
		
		System.out.println();
		System.out.printf("Valor da promoção: R$ %.2f%n", promo);
		System.out.printf("Valor atualizado: R$ %.2f%n", valFinal);

	}

}
