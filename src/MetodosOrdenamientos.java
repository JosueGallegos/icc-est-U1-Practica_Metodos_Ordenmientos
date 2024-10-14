import java.util.Arrays;

public class MetodosOrdenamientos {

    public int [] MetodoBurbuja(int []numeros, boolean logs, boolean forma){
        int[] numeros1 = Arrays.copyOf(numeros, numeros.length);
        int tamano = numeros1.length;

        for (int i = 0; i < tamano; i++) {
            if (logs) {
                System.out.println("\n Pasado el " + i);
            }

            for (int j = i + 1; j < tamano; j++) {
                if (logs) {
                    System.out.println(" i = " + numeros1[i] + " j = 1" + numeros1[j]);
                }

                if (forma) {
                    if (numeros1[i] > numeros1[j]) {

                        if (logs) {
                            System.out.println(" Si es mayor así que cambio");
                        }
                        int temporal = numeros1[i];
                        numeros1[i] = numeros1[j];
                        numeros1[j] = temporal;
                        if (logs) {
                            System.out.print(" ");
                            imprime(numeros1);
                        }

                    }

                } else {
                    if (numeros1[i] < numeros1[j]) {

                        if (logs) {
                            System.out.println(" Si es menor así que cambio");
                        }
                        int temporal = numeros1[i];
                        numeros1[i] = numeros1[j];
                        numeros1[j] = temporal;
                        if (logs) {
                            System.out.print(" ");
                            imprime(numeros1);
                        }
                    }
                }
            }
        }
        return numeros1;
    }

    public int [] MetodoSeleccion(int [] numeros,boolean logs, boolean forma){
        int[] numeroC2 = Arrays.copyOf(numeros, numeros.length);
        int tamano = numeroC2.length;

        for (int i = 0; i < tamano; i++) {

            int index_menor = i;

            for (int j = i + 1; j < tamano; j++) {

                if (forma) {
                    if (numeroC2[j] < numeroC2[index_menor]) {
                        index_menor = j;
                    }

                } else {
                    if (numeroC2[j] > numeroC2[index_menor]) {
                        index_menor = j;
                    }
                }
            }

            int aux = numeroC2[index_menor];
            numeroC2[index_menor] = numeroC2[i];
            numeroC2[i] = aux;

            if (logs) {
                System.out.println(" Paso " + (i + 1) + " : ");
                imprime(numeroC2);
            }
        }
        return numeroC2;

    }

    public int [] MetodoInserccion(int [] numeros, boolean logs, boolean forma){
        int[] numerosC3 = Arrays.copyOf(numeros, numeros.length);
        int tamano = numerosC3.length;
        for (int i = 1; i < tamano; i++) {

            int elementoNuevo = numerosC3[i];
            int j = i - 1;
            if (forma) {
                while (j >= 0 && numerosC3[j] > elementoNuevo) {
                    numerosC3[j + 1] = numerosC3[j];
                    j = j - 1;

                    if (logs) {
                        System.out.print(" Paso " + i + " : ");
                        imprime(numerosC3);
                    }
                }
            } else {
                while (j >= 0 && numerosC3[j] < elementoNuevo) {
                    numerosC3[j + 1] = numerosC3[j];
                    j = j - 1;
                    if (logs) {
                        System.out.print(" Paso " + i + " : ");
                        imprime(numerosC3);
                    }

                }
            }
            numerosC3[j + 1] = elementoNuevo;
            imprime(numerosC3);
        }
        return numerosC3;

    }

    public int [] MetodoBurbujaMejorado(int [] arreglo, boolean logs, boolean forma ){
        int[] numeros2 = Arrays.copyOf(arreglo, arreglo.length);
        boolean cambio;
        int tamano = numeros2.length;

        for (int i = 0; i < tamano; i++) {
            cambio = false;
            if (logs) {
                System.out.println("\nPasado el " + i);
            }
            for (int j = i + 1; j < tamano; j++) {
                if (forma) {
                    if (numeros2[i] > numeros2[j]) {

                        if (logs) {
                            System.out.println(" Si es mayor asi que cambio: ");
                        }
                        int aux = numeros2[i];
                        numeros2[i] = numeros2[j];
                        numeros2[j] = aux;
                        cambio = true;
                        if (logs) {
                            System.out.print(" ");
                            imprime(numeros2);
                        }
                    }
                } else {
                    if (numeros2[i] < numeros2[j]) {
                        if (logs) {
                            System.out.println(" Si es menor asi que cambio: ");
                        }
                        int aux = numeros2[i];
                        numeros2[i] = numeros2[j];
                        numeros2[j] = aux;
                        cambio = true;
                        if (logs) {
                            System.out.print(" ");
                            imprime(numeros2);
                        }
                    }
                }
            }
            if (!cambio) {
                break;
            }
        }
        return numeros2;

    }

    public void imprime(int[]arreglo){
        for(int i = 0; i < arreglo.length;i++){
            System.out.print( arreglo[i]+ " ");

        }
        System.out.println();
    }

    public void imprimeDescendente(int [] arreglo){
        for(int i = arreglo.length - 1; i >=0;i--){
            System.out.print( arreglo[i]+ " ");

        }
        System.out.println();
    }


    

}
