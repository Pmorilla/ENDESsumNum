package sumaNum;

public class SumaNumeros {
    public static void main(String[] args) {
        int cantidadNumeros = 10; // Número de elementos a sumar
        int resultadoSuma = calcularSuma(cantidadNumeros);
        System.out.println("La suma de los primeros " + cantidadNumeros + 
        		" números naturales es: " + resultadoSuma);
    }

    public static int calcularSuma(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}

