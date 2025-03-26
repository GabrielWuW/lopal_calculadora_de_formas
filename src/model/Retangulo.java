package model;

public class Retangulo {
	private double base;
	private double altura;
	
	
	public void setDados(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base * altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}
	
	public void exibirDados() {
		System.out.println("===================");
		System.out.println("=====Retangulo=====");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Area: " + calcularArea());
		System.out.println("Perimetro:" + calcularPerimetro());
		System.out.println("===================");
	}
}