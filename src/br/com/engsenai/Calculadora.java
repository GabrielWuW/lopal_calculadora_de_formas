package br.com.engsenai;

import model.Quadrado;
import model.Retangulo;

public class Calculadora {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		q1.setLado(10.6);
		q1.exibirDados();
		
		Retangulo r1 = new Retangulo();
		r1.setDados(10, 10);
		r1.exibirDados();
	}

}