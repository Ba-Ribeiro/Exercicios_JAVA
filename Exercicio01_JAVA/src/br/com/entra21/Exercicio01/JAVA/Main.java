package br.com.entra21.Exercicio01.JAVA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//	Escreva um programa que capture nome e idade do usuário 
//		e dê as boas vindas a sua aplicação de forma personalizada 
//		( incluindo o nome dela na saída em tela).
//		A saída em tela pode ser console ou window.
		
		Scanner entrada =new Scanner(System.in);
		
		String nome,snome; 
		byte idade;

	
		System.out.println("Qual seu nome completo?");
		nome=entrada.nextLine();
		System.out.println("Qual a sua idade?");
		idade=entrada.nextByte();
		System.out.println("Seja Bem-Vinda "+nome+" de "+ idade + " anos.");
		
	
		
	
	}

}
