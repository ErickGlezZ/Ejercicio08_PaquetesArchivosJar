package edu.tecjerez.topicos.figuras;

public class Triangulo {

	public double semiPerimetroTriangulo(double lado1, double lado2, double lado3) {
		
		double s = (lado1 + lado2 + lado3)/2;
		
		return s;
	}
	
	public double areaTriangulo(double lado1, double lado2, double lado3) {
		
		double s = (lado1 + lado2 + lado3)/2;
		
		return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}
}
