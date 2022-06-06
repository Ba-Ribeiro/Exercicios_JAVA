package br.com.entra21.Exercicio05.Java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		double temperaturaC,temperaturaF;
		
		
		System.out.println("Qual a temperatura em Graus Celsius?");
		temperaturaC=entrada.nextDouble();
		
		temperaturaF= 32+(temperaturaC *1.8);
		System.out.println("A Temperatura em Fahrenheit é: " +temperaturaF);
	}

}
