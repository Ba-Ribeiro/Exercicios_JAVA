package br.com.entra21.Exercico03_JAVA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		String produto;
		double precoCusto, precoVenda; 
		
		System.out.println("Qual o nome do produto?");
		produto=entrada.next();
		System.out.println("Qual o preço de custo do "+produto);
		precoCusto=entrada.nextDouble();
		precoVenda = precoCusto+(precoCusto*0.65);
		System.out.println("O preço de venda do "+produto+" é: "+precoVenda);
	

	}

}
