package br.com.engsenai.ui;

import java.util.Scanner;

import br.com.engsenai.dao.QuadradoDao;

public class Menu {
	
	public static void mostrarMenu() {
		
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("=========================");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Circunfêrencia");
		System.out.println("5 - Triângulo");
		System.out.println("=========================");
		System.out.print("Escolha uma opção (1-5): ");
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criarQuadrado();
		} else {
			System.out.println("Esta opção ainda não foi implementada...");
		}
	}
}
