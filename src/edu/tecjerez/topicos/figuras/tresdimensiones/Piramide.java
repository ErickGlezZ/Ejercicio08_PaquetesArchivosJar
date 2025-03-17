package edu.tecjerez.topicos.figuras.tresdimensiones;

public class Piramide {

    
    public double areaCuadradaPiramide(double lado) {
        return Math.pow(lado, 2);
    }

   
    public double areaRectangularPiramide(double base, double altura) {
        return base * altura;
    }

    
    public double areaTriangularPiramide(double base, double altura) {
        return 0.5 * base * altura;
    }

    
    public double perimetroCuadradaPiramide(double lado) {
        return 4 * lado;
    }

   
    public double perimetroRectangularPiramide(double base, double altura) {
        return 2 * (base + altura);
    }

    
    public double perimetroTriangularPiramide(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    
    public double areaLateralPiramide(double perimetro, double apotemaL) {
        return (perimetro * apotemaL) / 2;
    }

    
    public double areaTotalPiramide(double areaBase, double areaLateral) {
        return areaBase + areaLateral;
    }

    
    public double volumenPiramide(double areaBase, double alturaPiramide) {
        return (areaBase * alturaPiramide) / 3;
    }
}


