package sumaNum;

public class SumaNumeros 
{
	public static void main(String[] args) {
        int n = 10; // Número de elementos a sumar
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros " + n + 
        		" números naturales es: " + suma);
    }
}
