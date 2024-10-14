import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        MetodosOrdenamientos metodos = new MetodosOrdenamientos();

        int [] arreglonum = new int[0];
        int opcion;
        do{
            System.out.println(" \n Menu Principal ");
            System.out.println(" ======================== ");
            System.out.println(" 1. Ingrese el Arreglo ");
            System.out.println(" 2. Ordenar el Arreglo ");
            System.out.println(" 0. Salir ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                System.out.println(" Ingrese su tamaño de su arreglo ");
                int tamano = scanner.nextInt();
                arreglonum = new int[tamano];
                for(int i =0; i < arreglonum.length;i++){
                    System.out.println(" Ingrese el valor para " + (i + 1)+ ": ");
                    arreglonum[i]= scanner.nextInt();

                }
                metodos.imprime(arreglonum);
                    
                    break;
                case 2: 
                mostrarSubMenuMetodos(scanner,metodos,arreglonum);
                break;

                case 0:
                System.out.println(" Saliendo del programa....\n Adios ");
                break;

                default:
                System.out.println(" Opcion Valida. ");
            
    
            }


        } while(opcion !=0);
    }

    public static void mostrarSubMenuMetodos(Scanner scanner,MetodosOrdenamientos metodos, int [] arreglo){
        int opcionMetodo;
        do{
            System.out.println(" \n Escoja el metodo de Ordenamioento: ");
            System.out.println(" 1. Metodo Burbuja. ");
            System.out.println(" 2. Metodo Seleccion. ");
            System.out.println(" 3. Metodo Inserccion. ");
            System.out.println(" 4. Metodo Burbuja Mejorado. ");
            System.out.println(" 0. Regresa al Menu Principal. ");
            opcionMetodo= scanner.nextInt();
            
            switch (opcionMetodo) {
                case 1:
                System.out.println("Ingrese A para motrar los pasos\nIngrese B para no mostrar los pasos: ");
                String opcionLog = scanner.next();
                boolean cond;
                System.out.println(" Escoga ascendente o desecente");
                System.out.println(" 1. Ascendente. ");
                System.out.println(" 2. Descendente. ");
                int formaOrdenamiento = scanner.nextInt();
                boolean forma;
                if (opcionLog.equals("A")) {
                    cond = true;

                } else if (opcionLog.equals("B")) {
                    cond = false;

                } else {
                    System.out.println(" opcion no valida. ");
                    cond = false;
                }
                if (formaOrdenamiento == 1) {
                    forma = true;

                } else if (formaOrdenamiento == 2) {
                    forma = false;

                } else {
                    System.out.println(" opcion no valida. ");
                    forma = true;
                }
                    int [] arregloOrdenado = metodos.MetodoBurbuja(arreglo, cond, forma);
                    metodos.imprime(arregloOrdenado);
                    break;
                case 2:
                System.out.println("Ingrese A para motrar los pasos\nIngrese B para no mostrar los pasos: ");
                String opcionLog2 = scanner.next();
                boolean cond2;
                System.out.println("Escoga Ascendente o Decendente");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                int formaOrdenamiento2 = scanner.nextInt();
                boolean forma2;
                if (opcionLog2.equals("A")) {
                    cond2 = true;

                } else if (opcionLog2.equals("B")) {
                    cond2 = false;

                } else {
                    System.out.println("opcion no valida");

                    cond2 = false;
                }
                if (formaOrdenamiento2 == 1) {
                    forma2 = true;
                } else if (formaOrdenamiento2 == 2) {
                    forma2 = false;
                } else {
                    System.out.println("Opcion no valida");
                    forma2 = true;
                }
                    int [] arregloOrdenado2 = metodos.MetodoSeleccion(arreglo, cond2, forma2);
                    metodos.imprime(arregloOrdenado2);
                    break;

                case 3:

                System.out.println("Ingrese A para motrar los pasos\nIngrese B para no mostrar los pasos: ");
                String opcionLog3 = scanner.next();
                boolean cond3;
                System.out.println("Escoga Ascendente o Decendente");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                int formaOrdenamiento3 = scanner.nextInt();
                boolean forma3;
                if (opcionLog3.equals("A")) {
                    cond3 = true;

                } else if (opcionLog3.equals("B")) {
                    cond3 = false;

                } else {
                    System.out.println("opcion no valida");

                    cond3 = false;
                }
                if (formaOrdenamiento3 == 1) {
                    forma3 = true;
                } else if (formaOrdenamiento3 == 2) {
                    forma3 = false;

                } else {
                    System.out.println("Opcion no valida ");
                    forma3 = true;
                }
                    int [] arregloOrdenado3 = metodos.MetodoInserccion(arreglo, cond3, forma3);
                    metodos.imprime(arregloOrdenado3);
                    break;
                case 4: 
                System.out.println("Ingrese A para motrar los pasos\nIngrese B para no mostrar los pasos: ");
                String opcionLog4 = scanner.next();
                boolean cond4;
                System.out.println("Escoga Ascendente o Decendente");
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                int formaOrdenamiento4 = scanner.nextInt();
                boolean forma4;
                if (opcionLog4.equals("A")) {
                    cond4 = true;

                } else if (opcionLog4.equals("B")) {
                    cond4 = false;

                } else {
                    System.out.println("opcion no valida");

                    cond4 = false;
                }
                if (formaOrdenamiento4 == 1) {
                    forma4 = true;
                } else if (formaOrdenamiento4 == 2) {
                    forma4 = false;

                } else {
                    System.out.println("Opcion no valida ");
                    forma4 = true;
                }
                    int [] arregloOrdenado4 = metodos.MetodoBurbujaMejorado(arreglo, cond4, forma4);
                    metodos.imprime(arregloOrdenado4);
                    break;


            
                default:
                System.out.println(" Ingrese una Opcion Valida. ");
                    break;
            }
        } while (opcionMetodo !=0);
    }
}
