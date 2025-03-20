package atividades;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float numero1, numero2, numero3, numero4, produto;
		
		
		System.out.println("Insira o primeiro número:");
		numero1 = ler.nextFloat();
		
		System.out.println("Insira o segundo número:");
		numero2 = ler.nextFloat();
		
		System.out.println("Insira o terceiro número:");
		numero3 = ler.nextFloat();
		
		System.out.println("Insira o quarto número:");
		numero4 = ler.nextFloat();
		
		produto = (numero1*numero2)-(numero3*numero4);
		
		
		
		for (int linha = 0; linha < 50; linha++) {
		    System.out.println();
		}
		
		System.out.printf("A diferença do produto desses números é %.1f" , produto);

		
	}

}
