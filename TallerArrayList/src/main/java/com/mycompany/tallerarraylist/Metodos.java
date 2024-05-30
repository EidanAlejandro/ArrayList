/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerarraylist;
import java.util.ArrayList;
/**
 *
 * @author eidan
 */
public class Metodos {
    public static void definicionArrayList() {
        System.out.println("Definición de ArrayList:");
        System.out.println("ArrayList es una implementacion redimensionable de la interfaz List en Java. A diferencia de los arreglos tradicionales, cuya longitud es fija una vez creada, un ArrayList puede cambiar de tamaño dinamicamente a medida que se añaden o eliminan elementos. Esto proporciona una mayor flexibilidad al manejar colecciones de datos. ArrayList permite elementos duplicados y mantiene el orden de insercion.");
        System.out.println("Fuente: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html");
    }
    
    public static void diferencias() {
        System.out.println("Diferencias entre ArrayList y Arreglo o Vector:");
        System.out.println("1. Capacidad dinámica vs estatica:");
        System.out.println("   - ArrayList puede crecer y decrecer dinamicamente.");
        System.out.println("   - Los arreglos tienen una longitud fija una vez creados.");
        System.out.println("   - Fuente: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html");
        System.out.println("2. Sincronizacion:");
        System.out.println("   - Vector es sincronizado, lo que significa que es seguro para el acceso concurrente por multiples hilos.");
        System.out.println("   - ArrayList no es sincronizado.");
        System.out.println("   - Fuente: https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html");
        System.out.println("3. Rendimiento:");
        System.out.println("   - Debido a la sincronizacion, Vector es más lento que ArrayList.");
        System.out.println("   - ArrayList ofrece mejor rendimiento en operaciones de no sincronizacion.");
        System.out.println("   - Fuente: https://www.geeksforgeeks.org/vector-vs-arraylist-java/");
        System.out.println("4. Crecimiento:");
        System.out.println("   - ArrayList crece en un 50% de su tamaño actual.");
        System.out.println("   - Vector duplica su tamaño cuando se excede su capacidad.");
        System.out.println("   - Fuente: https://www.geeksforgeeks.org/vector-vs-arraylist-java/");
        System.out.println("5. Legado:");
        System.out.println("   - Vector es una clase antigua y parte del legado de Java 1.0.");
        System.out.println("   - ArrayList es parte del marco de colecciones introducido en Java 1.2.");
        System.out.println("   - Fuente: https://www.javatpoint.com/difference-between-arraylist-and-vector");
        System.out.println("6. Elementos Nulos:");
        System.out.println("   - ArrayList permite elementos nulos.");
        System.out.println("   - Los arreglos pueden tener elementos nulos solo si se inicializan explicitamente con nulos.");
        System.out.println("   - Fuente: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html");
    }
    
    public static void metodosArrayList() {
        System.out.println("Métodos de ArrayList en Java:");
        System.out.println("1. add(E e) - Añade un elemento al final de la lista.");
        System.out.println("2. remove(Object o) - Elimina la primera ocurrencia del elemento especificado.");
        System.out.println("3. get(int index) - Devuelve el elemento en la posicion especificada.");
        System.out.println("4. size() - Devuelve el numero de elementos en la lista.");
        System.out.println("Fuente: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html");
    }
    
    public static void conclusionesArrayList() {
        System.out.println("Conclusiones sobre el uso de ArrayList:");
        System.out.println("El uso de ArrayList es preferible cuando se necesitan listas dinamicas debido a su capacidad de redimensionarse automaticamente.");
    }
    public static void agregarElemento(ArrayList<String> arrayList, String elemento) {
        arrayList.add(elemento);
        System.out.println("Elemento agregado.");
    }

    public static void eliminarElemento(ArrayList<String> arrayList, String elemento) {
        if (arrayList.remove(elemento)) {
            System.out.println("Elemento eliminado.");
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static void buscarElemento(ArrayList<String> arrayList, String elemento) {
        if (arrayList.contains(elemento)) {
            System.out.println("Elemento encontrado.");
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static void mostrarContenido(ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("El ArrayList esta vacio.");
        } else {
            System.out.println("Contenido del ArrayList: " + arrayList);
        }
    }
}
