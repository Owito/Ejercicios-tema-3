public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 3;
        int suma = sumar(a, b, c);
        System.out.println("La suma de " + a + ", " + b + " y " + c + " es igual a " + suma);
    }
    
    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void aumentarPuertas() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche(3);
        miCoche.aumentarPuertas();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas");
    }
}

