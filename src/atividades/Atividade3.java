package atividades;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float salario, adicional, horaExtras, descontos;
		int horasTrabalhadas;
		
		
		System.out.println("Insira o valor do salário bruto:");
		salario = ler.nextFloat();
		
		System.out.println("\nInsira o valor do adicional noturno: ");
		adicional = ler.nextFloat();
		
		System.out.println("\nInsira o valor das horas extras: ");
		horaExtras = ler.nextFloat();
		
		System.out.println("\nInsira a quantidade de horas extras trabalhadas: ");
		horasTrabalhadas = ler.nextInt();
		
		System.out.println("\nInsira os valoes a serem descontados: ");
		descontos = ler.nextFloat();
		
		
		salario += (horaExtras*horasTrabalhadas)+adicional-descontos;
	
		for (int linha = 0; linha < 50; linha++) {
		    System.out.println();
		}
		
		System.out.printf("O salário será R$%.2f" , salario);
	
		
		
	}

}
