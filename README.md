# Ejercicio2

## Descripción

Este proyecto implementa varias funciones útiles en Java, incluyendo:

1. Determinar si una cadena puede ser determinada a partir de otra.
2. Encontrar si hay números duplicados dado un índice.
3. Determinar si un número es "feliz".
4. Define el índice de ocurrencia de una cadena en otra.

El programa incluye un menú interactivo que permite al usuario probar cada una de estas funciones ingresando datos desde la terminal.

---

## Funciones implementadas

### 1. Generar Cadena
**Método:** `generaCadena(String nota, String texto)`

Este método recibe una nota y un texto, determinando si apartir de texto se puede genrar la nota. Nos devuelve un booleano, donde "true" eindica que sí se puede genrar y "false" que no.
**Ejemplo:**
```java
String cadena = "aa";
String texto = "aba"
boolean resultado = generaCadena(nota,texto);
// Resultado: false
```
### 2.Números duplicados y su índice
**Método:**`existeDuplicadoEnRango(int[] A, int k)`
Dado un arreglo de eneteros y un índice k, determina si existen dos índices distintos tales que que
haya algún número duplicado en un rango de k lugares.
**Ejemplo:**
```java
int[] A = [1,2,3,1];
int k = 3;
boolean res = existeDuplicadoEnRango(A,k):
// Resultado: "true"
```
### 3.Número Feliz
**Método:**`numeroFeliz(int n)`
Este método recibe un entero y al ir elevando cada uno de sus dígitos al cuadrado, sumarlos e ir reduciéndolo nos dice si es un número feliz o no, por lo que regresa un boolean. 
**Ejemplo:**
```java
int n = 19;
boolean resp = numeroFeliz(n);
// Resultado: true
```
### 4. Índice de ocurrencia
**Método:**`ocurrenciaPalabra(String palabra, String cadena)`
Dadas dos cadenas s y t, regresa el índice de la primera ocurrencia de s en t, o -1 si s
no es parte de t.
**Ejemplo:**
```java
String palabra = "tristes";
String cadena = "trestristestigrestragabantrigoenuntrigal";
int índice = ocurrenciaPalabra(palabra,cadena);
// Resultado: 4
```
## 5.Salida
---

### ¿Cómo compilar y ejecutar?
**Requisitos previos:**
Java Development Kit (JDK) 8 o superior.
Maven (opcional, si deseas usarlo para compilar y ejecutar).

## Compilación manual:
1. Navega al directorio donde se encuentran los archivos .java.
2. Compila los archivos con el siguiente comando:
```java
javac Ejercicio2/*.java
```
3. Ejecuta el programa con:
```java
java Ejercicio2.Main
```
## Compilación y ejecución con Maven
1. Asegúrate de que el archivo pom.xml esté configurado correctamente.
2. Compila el proyecto con:
```java
mvn clean package
```
3. Ejecuta el archivo .jar generado en el directorio target:
```java
java -jar target/Ejercicio2-1.0-SNAPSHOT.jar
```
## Uso del programa:
Para utilizar el programa deberás de seleccionar alguna de las opciones que aparezcan enlistadas en la terminal después de haber compilado y ejcutado el programa, como se muestra a continuación:
Por favor, selesccione una opción:
1. Generar nota a partir de texto
2. Verificar duplicado en rango
3. Número feliz
4. Indice de concurrencia
5. Salir
La entrada del usuario deberá de ser de este tipo:
Seleccione una opción:
"2": "Verificar duplicado en rango"
Ingrese los números separados por espacios ó por "enter":
4 3 6 2 1 1

Una vez seleccionado algo del menú que aparezca, deberá de ir colocando cada una de la información que se le pida al usuario.

## Estructura del proyecto:
   PrácticasMP/
    └── Ejercicio2/
        ├── Ejercicio2.java
        ├── Main.java
        └── pom.xml

## AUTOR:
Michelle Alanis Navarro Fierro

Este archivo `README.md` proporciona toda la información necesaria para entender, compilar, ejecutar y usar el programa.
