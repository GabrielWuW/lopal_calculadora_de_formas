package br.com.engsenai;

import br.com.engsenai.ui.Menu;
import model.Retangulo;

public class Calculadora {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		retangulo.setDados(10, 15);
		retangulo.exibirDados();
		
		Menu.mostrarMenu();
		
	}

}