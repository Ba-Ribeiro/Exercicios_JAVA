package br.com.entra21.Exercicio06.Java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		double temperaturaC,temperaturaF;
		
		
		
		System.out.println("Informe a temperatura em graus Fahrenheit?");
		temperaturaF=entrada.nextDouble();
		
		temperaturaC= (temperaturaF-32)/1.8;
		System.out.println("A temperatura em graus Celsius é: " + temperaturaC);
	}

}
