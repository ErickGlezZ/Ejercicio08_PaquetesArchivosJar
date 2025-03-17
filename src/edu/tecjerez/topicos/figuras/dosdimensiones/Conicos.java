package edu.tecjerez.topicos.figuras.dosdimensiones;

public class Conicos {

	//Clases INTERNAS
		public class Circulo{
			
			public double areaCirculo(double radio) {
				
				double pi = Math.PI;
				
				return pi * Math.pow(radio, 2);
				
			}
			
			
			public double perimetroCirculo(double radio) {
				
				double pi = Math.PI;
				
				return 2 * pi * radio;
				
			}
		}
		
		
		public class Elipse{
			
			public double areaElipse(double semiejeMayor, double semiejeMenor) {
				
				double pi = Math.PI;
				
				return pi * semiejeMayor * semiejeMenor;
			}
			
			
			public double perimetroElipse(double semiejeMayor, double semiejeMenor) {
				
				double pi = Math.PI;
				
				return pi * (3*(semiejeMayor + semiejeMenor) - Math.sqrt((3 * semiejeMayor + semiejeMenor) * (semiejeMayor + 3 * semiejeMenor)));
			}
		}
}
