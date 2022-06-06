package br.com.entra21.Exercicio02.JAVA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		float altura, base,area,perimetro;
		
		System.out.println("Qual a altura do seu retangulo?");
		altura=entrada.nextFloat();
		System.out.println("Qual o tamanho da base do seu retangulo?");
		base=entrada.nextFloat();
		
		area = base * altura;
		perimetro= base*2 + altura*2;
		
		System.out.println("A area de um perimetro é: "+area);
		System.out.println("O perimetro do meu retangulo é: "+perimetro);
	
	
		
}
}