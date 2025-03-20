package atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.println("Insira o valor do salário: ");
		salario = ler.nextFloat();
		
		System.out.println("Insira o valor do abono: ");
		abono = ler.nextFloat();
		
		salario += abono;
		//for está escrevendo 49 linhas vazias para simular um diretório limpo
		for (int linha = 0; linha < 50; linha++) {
		    System.out.println();
		}
		
		System.out.printf("Você receberá R$%.2f" , salario);

		
		
	}

}
