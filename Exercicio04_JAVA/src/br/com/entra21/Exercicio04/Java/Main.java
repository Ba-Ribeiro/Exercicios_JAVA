package br.com.entra21.Exercicio04.Java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);

		float peso,altura,IMC;
		
		System.out.println("Informe a sua altura");
		altura=entrada.nextFloat();
		System.out.println("Informe seu peso");
		peso=entrada.nextFloat();
		IMC=peso/(altura*altura);
		System.out.println("Seu IMC é:"+IMC);
		
	}

}
