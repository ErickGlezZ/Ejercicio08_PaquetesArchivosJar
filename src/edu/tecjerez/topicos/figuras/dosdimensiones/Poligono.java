package edu.tecjerez.topicos.figuras.dosdimensiones;

public class Poligono {
	
		//Clase INTERNA
		public class Rombo{
			
			public double areaRombo(double D, double d) {
				
				return (D * d)/2;
			}
			
			public double perimetroRombo(double ladoD, double ladod) {
				
				return (ladoD + ladod) * 2;
			}
		}
}
