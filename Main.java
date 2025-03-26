package Ejercicio2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Por favor, selesccione una opción:");
        System.out.println("1. Generar nota a partir de texto");
        System.out.println("2. Verificar duplicado en rango");
        System.out.println("3.Número feliz");
        System.out.println("4.Indice de ocurrencia");
        System.out.println("5. Salir");
        opcion = s.nextInt();
        s.nextLine();

        switch(opcion){
            case 1:
                    // Generar nota a partir de texto
                    System.out.println("Ingrese la nota:");
                    String nota = s.nextLine();
                    System.out.println("Ingrese el texto:");
                    String texto = s.nextLine();
                    boolean puedeGenerar = Ejercicio2.generaCadena(nota, texto);
                    if (puedeGenerar) {
                        System.out.println("La nota puede ser generada a partir del texto.");
                    } else {
                        System.out.println("La nota NO puede ser generada a partir del texto.");
                    }
                    break;

                case 2:
                    // Verificar duplicado en rango
                    System.out.println("Ingrese el tamaño del arreglo:");
                    int n = s.nextInt();
                    int[] arreglo = new int[n];
                    System.out.println("Ingrese los elementos del arreglo:");
                    for (int i = 0; i < n; i++) {
                        arreglo[i] = s.nextInt();
                    }
                    System.out.println("Ingrese el valor de k:");
                    int k = s.nextInt();
                    boolean duplicado = Ejercicio2.existeDuplicadoEnRango(arreglo, k);
                    if (duplicado) {
                        System.out.println("Existe un duplicado dentro del rango k.");
                    } else {
                        System.out.println("No existe un duplicado dentro del rango k.");
                    }
                    break;

                case 3:
                    // Número feliz
                    System.out.println("Ingrese un número:");
                    int numero = s.nextInt();
                    boolean esFeliz = Ejercicio2.numeroFeliz(numero);
                    if (esFeliz) {
                        System.out.println("El número es feliz.");
                    } else {
                        System.out.println("El número NO es feliz.");
                    }
                    break;

                case 4:
                    // Índice de ocurrencia
                    System.out.println("Ingrese la palabra a buscar:");
                    String palabra = s.nextLine();
                    System.out.println("Ingrese la cadena donde buscar:");
                    String cadena = s.nextLine();
                    int posicion = Ejercicio2.ocurrenciaPalabra(palabra, cadena);
                    if (posicion != -1) {
                        System.out.println("La palabra aparece por primera vez en la posición: " + posicion);
                    } else {
                        System.out.println("La palabra no se encuentra en la cadena.");
                    }
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

        s.close(); // Cerrar el Scanner

    }
}