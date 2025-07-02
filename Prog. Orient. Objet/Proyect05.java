// Clase abstracta base para figuras geométricas
abstract class figura {
    // Método abstracto para calculo del perímetro
    abstract double perimetro();
}

// Clase para representar un círculo
class circulo extends figura {
    double radio;
    // Constructor 
    circulo(double r) {
        this.radio = r;
    }
    // Implementación del perímetro del círculo
    public double perimetro() {
        return(2 * Math.PI * radio);
    }
}

// Clase para representar un cuadrado
class cuadrado extends figura {
    double lado;
    // Constructor 
    cuadrado(double l) {
        this.lado = l;
    }
    // Implementación del perímetro del cuadrado
    public double perimetro() {
        return(4 * lado);
    }
}

// Clase para representar un triángulo
class triangulo extends figura {
    double base, altura, hipotenusa;
    // Constructor 
    triangulo(double b, double a, double h) {
        this.base = b;
        this.altura = a;
        this.hipotenusa = h;
    }
    // Implementación del perímetro del triángulo
    public double perimetro() {
        return(base + altura + hipotenusa);
    }
}

// Clase para representar un rectángulo
class rectangulo extends figura {
    double base, altura;
    // Constructor 
    rectangulo(double b, double h) {
        this.base = b;
        this.altura = h;
    }
    // Implementación del perímetro del rectángulo
    public double perimetro() {
        return(2 * (base + altura));
    }
}

// Clase para representar un rombo
class rombo extends figura{
    double lado;
    // Constructor que recibe el lado
    rombo(double l) {
        this.lado = l;
    }
    // Implementación del perímetro del rombo
    public double perimetro() {
        return(4 * lado);
    }
}

// Clase principal para probar las figuras
public class Proyect05 {
    public static void main(String[] args) {
        // Creamos instancias de cada figura
        figura C = new circulo(5);
        figura Cu = new cuadrado(4);
        figura T = new triangulo(3, 4, 5);
        figura R = new rectangulo(6, 3);
        figura Ro = new rombo(2);

        // Imprimimos los perímetros de cada figura
        System.out.println("Perimetro del circulo: " + C.perimetro());
        System.out.println("Perimetro del cuadrado: " + Cu.perimetro());
        System.out.println("Perimetro del triangulo: " + T.perimetro());
        System.out.println("Perimetro del rectangulo: " + R.perimetro());
        System.out.println("Perimetro del rombo: " + Ro.perimetro());
    }
}
