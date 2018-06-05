package practicafuncionarrays;

/**
 *
 * @author jesus
 */
public class PracticaFuncionArrays {

    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 11) + 1;
        int[] n = new int[aleatorio];
        System.out.println("Array original: ");
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 5) + 1;
        }

        muestraArray(n);

        System.out.println();

        System.out.println("Pareja de Array generada:");
        muestraArray(parejaAleatoria(n));

    }

    public static void muestraArray(int x[]) {

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static int[] parejaAleatoria(int[] a) {
        int resultado[] = new int[3];
        for (int i = 0; i < resultado.length; i++) {
            int indiceAleatorio = (int) (Math.random() * a.length);
            System.out.println("Indice Aleatorio " + indiceAleatorio);
            resultado[i] = a[indiceAleatorio];
        }

        return resultado;
    }
//    public static int[] parejaAleatoriaDistinta(int[] a) {
//        int resultado[] = new int[3];
//        int indiceAleatorio = 0;
//        for (int i = 0; i < resultado.length; i++) {
//            indiceAleatorio = (int) (Math.random() * a.length);
//            if ((indiceAleatorio != indiceAleatorio)) {
//
//                System.out.print("Indice Aleatorio: " + indiceAleatorio);
//
//                resultado[i] = a[indiceAleatorio];
//            }
//            System.out.print("Indice Aleatorio bueno: " + indiceAleatorio);
//
//        }
//        return resultado;
//    }
}
//practicar con otra cantidad de número, que devuelva con 1 solo valor al azar, que devuelva una pareja pero sin repetir el indice ni ningún valor del array
