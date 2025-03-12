package model;

public class Quadrado {
	private double lado;
	private double area;
	private double perimetro;
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		area = Math.pow(lado, 2);
		return area;
	}

	public double calcularPerimetro() {
		perimetro = lado * 4;
		return perimetro;
	}

	public void exibirDados() {
		System.out.println("=====Quadrado======");
		System.out.println("===================");
		System.out.println("Lado: " + lado);
		System.out.println("Area: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
		System.out.println("===================");
	}
}