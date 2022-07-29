package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o primeiro Valor: ");
		a = scan.nextInt();
		b = scan.nextInt();

		int soma = soma(a,b);
		int subtracao = subtracao(a, b);
		int multiplicao = multiplicao(a,b);
		int divisão = divisão (a,b);

		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicao);
		System.out.println(divisão);
	}
	
	public static int soma(int a, int b) {
		return a + b;

	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int divisão(int a, int b) {
		return a / b;
	}

	public static int multiplicao(int a, int b) {
				return a * b;
				
	}}