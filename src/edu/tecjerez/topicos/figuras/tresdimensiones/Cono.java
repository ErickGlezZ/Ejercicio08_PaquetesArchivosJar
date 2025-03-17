package edu.tecjerez.topicos.figuras.tresdimensiones;

public class Cono {

	public double areaBaseCono(double radio) {
		double pi = Math.PI;
		
		return pi * Math.pow(radio, 2);
	}
	
	public double areaLateralCono(double radio, double altura) {
		double pi = Math.PI;
		
		double g = Math.sqrt(Math.pow(radio, 2) * Math.pow(altura, 2));
		
		return pi * radio * g;
	}
	
	public double areaTotalCono(double radio, double altura) {
		double pi = Math.PI;
		
		double g = Math.sqrt(Math.pow(radio, 2) * Math.pow(altura, 2));
		
		return (pi * Math.pow(radio, 2)) + (pi * radio * g);
	}
	
	public double volumenCono(double radio, double altura) {
		double pi = Math.PI;
		
		return 0.33 * pi * Math.pow(radio, 2) * altura;
	}
	
	public double perimetroCono(double radio) {
		double pi = Math.PI;
		
		return 2 * pi * radio;
	}
}
