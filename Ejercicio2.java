package Ejercicio2;

import java.lang.IllegalArgumentException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejercicio2{
    /*
     * Método que recibe una nota y verfica si piuede ser generada a partir de un texto
     * @param nota: la nota a generar
     * @param texto: el texto a partir del cual se generará la nota
     * @return true si la nota puede ser generada a partir del texto, false en otro caso
     */
    public static boolean generaCadena(String nota, String texto){
        if(nota == null || texto == null || nota.isEmpty() || texto.isEmpty()){
            throw new IllegalArgumentException("Por favor, introduzca cadenas válidas no vacías");
        }
        //Convertimos ambas cadenas a minúsculas en caso de que no lo estén
        String notaAMin = nota.toLowerCase();
        String textoAMin = texto.toLowerCase();
        //Creamos un HashMap para guardar las frecuencias de cada letra en la nota  
        Map<Character, Integer> conteoT = new HashMap<>();
        for (char c : textoAMin.toCharArray()) {
            conteoT.put(c, conteoT.getOrDefault(c, 0) + 1);
        }

        // Verificar si cada carácter de la nota puede ser generado a partir del texto
        for (char c : notaAMin.toCharArray()) {
            if (!conteoT.containsKey(c) || conteoT.get(c) == 0) {
                return false; // No se puede generar la nota
            }
            conteoT.put(c, conteoT.get(c) - 1); // Reducir el conteo del carácter
        }

        return true; // La nota puede ser generada
    }  
    /*
     * Método que determina si existen dos índices distintos i, j en el arreglo A
     * tales que A[i] = A[j] y |i - j| <= k.
     * @param A: el arreglo de enteros
     * @param k: la diferencia máxima entre los índices
     * @return true si existen dos índices i, j que cumplan la condición, false en otro caso
     */
    public static boolean existeDuplicadoEnRango(int[] A, int k) {
        // Mapa para almacenar el último índice de cada número
        Map<Integer, Integer> mapa = new HashMap<>();

        // Recorrer el arreglo
        for (int i = 0; i < A.length; i++) {
            // Si el número ya está en el mapa y la distancia entre índices es <= k
            if (mapa.containsKey(A[i]) && i - mapa.get(A[i]) <= k) {
                return true; // Se encontró un duplicado dentro del rango
            }
            // Actualizar el índice del número en el mapa
            mapa.put(A[i], i);
        }

        return false; // No se encontró ningún duplicado dentro del rango
    }
    /*
     * Método que recibe un número y regresa "true" si es un número feliz, "false" en otro caso
     * @param n: el número a verificar
     * @return true si el número es feliz, false en otro caso
     */

    public static boolean numeroFeliz(int n) {
        if (n <= 1 || n >= 2147483647) {
            throw new IllegalArgumentException("El número debe ser mayor a 1 y menor a 2,147,483,647");
        }

        HashSet<Integer> visitados = new HashSet<>();

        while (n != 1 && !visitados.contains(n)) {
            visitados.add(n);
            n = sumaCuadradosDigitos(n);
        }

        return n == 1;
    }

    // Método auxiliar para calcular la suma de los cuadrados de los dígitos de un número
    private static int sumaCuadradosDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            int digito = num % 10;
            suma += digito * digito;
            num /= 10;
        }
        return suma;
    }
    /*
     * Método que cadqa una palabra busca su primer concurerencia en una cadena dada, devolviendo
     * el índice de concurencia, si no lo encuentra devuelve -1
     * @param palabra: la palabra a buscar
     * @param cadena: la cadena en la que se buscará la palabra
     * @return el índice de concurrencia de la palabra en la cadena, -1 si no se encuentra
     */
    public static int ocurrenciaPalabra(String palabra, String cadena){
        if(palabra == null || palabra.isEmpty() || cadena == null || cadena.isEmpty()){
            throw new IllegalArgumentException("Por favor, introduzca cadenas válidas no vacías");
        }
        //utilizando métodos de String:
        //int posicion = cadena.indexOf(palabra);
        //return posicion;
        char [] arCadena = cadena.toCharArray();
        char [] arPalabra = palabra.toCharArray();
        
        for(int i = 0; i< arCadena.length - arPalabra.length; i ++){
            boolean encontrado = true;
            for(int j = 0; j < arPalabra.length; j ++){
                if(arCadena[i+j] != arPalabra[j]){
                    encontrado = false;
                    break;// si no encontramos la palabra nos salimos de este ciclo
                } 
                if(arCadena [i+j] == arPalabra[j]){
                    return i;
                }
            }

        }
        return -1; // si no encuentra la palabra en cadena
    }
}
