package sumaNum;

public class SumaNumeros {

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        int cantidadNumeros = 10; // Número de elementos a sumar
        int resultadoSuma = calcularSuma(cantidadNumeros);
        System.out.println("La suma de los primeros " + cantidadNumeros + 
        		" números naturales es: " + resultadoSuma);
    }

    /**
     * Calcula la suma de los primeros n números naturales.
     *
     * @param n La cantidad de números naturales a sumar.
     * @return La suma de los primeros n números naturales.
     */
    public static int calcularSuma(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}


