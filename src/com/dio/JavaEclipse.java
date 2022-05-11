package com.dio;

import java.util.Scanner;

public class JavaEclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer A=0;
		Integer B=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os valores de A e B");
		A = teclado.nextInt();
		B = teclado.nextInt();
		teclado.close();
		
		int Soma = A+B;
		
		System.out.println("A soma é = " + String.valueOf(Soma));

	}

}
