package atividades;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float numero1, numero2, numero3, numero4, media;
		
		System.out.println("Insira a nota da primeira avaliação: ");
		numero1 = ler.nextFloat();
		System.out.println("Insira a nota da segunda avaliação: ");
		numero2 = ler.nextFloat();
		System.out.println("Insira a nota da terceira avaliação: ");
		numero3 = ler.nextFloat();
		System.out.println("Insira a nota da quarta avaliação: ");
		numero4 = ler.nextFloat();
		
		
		media = (numero1+numero2+numero3+numero4)/4;
		
		for (int linha = 0; linha < 50; linha++) {
		    System.out.println();
		}
		
		System.out.printf("A sua nota desse semestre é %.1f" , media);
		
		if(media >= 6) {
			
			System.out.println("\nVocê foi aprovado.");
			
		} else {
		
			System.out.println("\nVocê está reprovadao.");
		}
		
		
	}

}
