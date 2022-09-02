import java.util.ArrayList;
import java.util.List;

public class principal {

    public static void main(String[] args) {
        int[] resultado = geraPrimos(100);
        for(Integer i : resultado){
            System.out.println(i + " ");
        }
    }

    static int[] geraPrimos(int maximo) {

        int[] isPrimo = new int[maximo + 1];
        int[] resultado = new int[maximo + 1];

        for (int i = 0; i <= maximo; i++) {
            isPrimo[i] = 1;
        }

        for (int i = 2; i <= Math.sqrt(maximo); i++) {
            if (isPrimo[i] == 1) {
                for (int j = 2; i * j <= maximo; j++) {
                    isPrimo[i * j] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= maximo; i++) {
            if (isPrimo[i] == 1) {
                resultado[count] = i;
                count++;
            }
        }
        return resultado;
    }
}
