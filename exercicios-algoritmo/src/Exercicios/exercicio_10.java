package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_10 {

	public static void main(String[] args) {

// 10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a 
//     ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de 
//     tinta pinta uma área de 2metros quadrados.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Qual a largura da parede? ");
		double largura = sc.nextDouble();
		System.out.printf("Qual o comprimento da parede? ");
		double altura = sc.nextDouble();

		double area = largura * altura;
		double qtinta = area / 2;

		System.out.println();
		System.out.printf("Área da parede: %.2fm² %n", area);
		System.out.println();
		System.out.printf("Quantidade de tinta para pintar: %.2fL %n", qtinta);
	}
}
