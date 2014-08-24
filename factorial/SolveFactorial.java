package factorial;

/**
 *
 * @author Juane
 */
public class SolveFactorial {

    public static void main(String[] args) {
        double num = 100;

        double result = Solve(num);
        System.out.println("El resultado de factorial es: " + result + " (Si el resultado es -1, el resultado superó el valor máximo del tipo de dato double)");

        int zeros = (int) TrailingZeros(num);
        System.out.println("Tiene: " + zeros + " cero(s) a la derecha");
    }

    public static double Solve(double num) {
        
        //Inicialización de variables
        double intRes = 1;
        double aux = 0;
        double i = aux;

        //Calcular factorial
        for (i = num; i > 0; i--) {
            aux = intRes * i;
            intRes = Math.abs(aux);
        }
        
        return intRes;
    }

    public static double TrailingZeros(double num) {
        int count = 0;
        for (int j = 5; num / j >= 1; j *= 5) {
            count += num / j;
        }
        return count;
    }
}