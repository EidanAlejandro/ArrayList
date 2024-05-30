/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerarraylist;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author eidan
 */
public class TallerArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int opcion;
        int subopcion;
        do {
            System.out.println("Seleccione el metodo de ordenamiento:");
            System.out.println("1. Ver la definicion de ArrayList");
            System.out.println("2. Diferencias entre un ArrayList y un Arreglo o Vector");
            System.out.println("3. Ver metodos de la clase ArrayList");
            System.out.println("4. Conclusiones sobre ArrayList");
            System.out.println("5. Submenu funcionalidades");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opcion: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un numero entero valido para elegir la opcion: ");
                scanner.next();
            }

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Metodos.definicionArrayList();
                    break;
                case 2:
                    Metodos.diferencias();
                    break;
                case 3:
                    Metodos.metodosArrayList();
                    break;
                case 4:
                    Metodos.conclusionesArrayList();
                    break;
                case 5:
                    do {
                        System.out.println("Submenu:");
                        System.out.println("1. Agregar un elemento al ArrayList");
                        System.out.println("2. Eliminar un elemento del ArrayList");
                        System.out.println("3. Buscar un elemento en el ArrayList");
                        System.out.println("4. Mostrar el contenido del ArrayList");
                        System.out.println("5. Volver al menu principal");
                        System.out.print("Seleccione una opcion: ");
                        
                        while (!scanner.hasNextInt()) {
                            System.out.println("Ingrese un numero entero valido para elegir la opcion: ");
                            scanner.next();
                        }
                        subopcion = scanner.nextInt();
                        scanner.nextLine();
                        switch (subopcion) {
                            case 1:
                                System.out.print("Ingrese el elemento a agregar: ");
                                String addElement = scanner.nextLine();
                                Metodos.agregarElemento(arrayList, addElement);
                                break;
                            case 2:
                                System.out.print("Ingrese el elemento a eliminar: ");
                                String removeElement = scanner.nextLine();
                                Metodos.eliminarElemento(arrayList, removeElement);
                                break;
                            case 3:
                                System.out.print("Ingrese el elemento a buscar: ");
                                String searchElement = scanner.nextLine();
                                Metodos.buscarElemento(arrayList, searchElement);
                                break;
                            case 4:
                                Metodos.mostrarContenido(arrayList);
                                break;
                            case 5:
                                System.out.println("Saliendo");
                                break;
                            default:
                                System.out.println("Opcion invalida, por favor ingrese una opcion valida.");
                                break;
                        }
                    } while (subopcion != 5);
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 6);
        scanner.close();
    }
}
