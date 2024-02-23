/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloobjetos;


import java.util.Scanner;

/**
 *
 * @author Ricardo Luna Allende Vespertino 7 U
 */
public class ArregloObjetos {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int n;

        do {
            System.out.println("Ingrese la cantidad de personas: ");
            while (!datos.hasNextInt()) {
                System.out.println("Ingrese solo numeros");
                datos.next();
            }
            n = datos.nextInt();
            datos.nextLine(); // Limpiar el buffer de entrada
        } while (n <= 0);

        Persona[] personas = new Persona[n];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese los datos: ");
            System.out.println("Persona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = datos.nextLine();

            personas[i] = new Persona(nombre);

            int edad;

            do {
                System.out.print("Edad: ");
                while (!datos.hasNextInt()) {
                    System.out.println("Ingrese solo numeros");
                    System.out.print("Edad: ");
                    datos.next();
                }
                edad = datos.nextInt();
                datos.nextLine(); // Limpiar el buffer de entrada
                if (edad < 1 || edad > 80) {
                    System.out.println("Ingrese una edad correcta");
                }
            } while (edad < 1 || edad > 80);
            personas[i].setEdad(edad);

            System.out.print("Genero: ");
            String genero = datos.nextLine();
            personas[i].setGenero(genero);

            System.out.print("Estado civil: ");
            String estadoCivil = datos.nextLine();
            personas[i].setEstadoCivil(estadoCivil);
        }

        System.out.println("\nDatos de las personas:");

        for (int i = 0; i < personas.length; i++) {
            System.out.println("*************************************");
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Edad: " + personas[i].getEdad());
            System.out.println("Genero: " + personas[i].getGenero());
            System.out.println("Estado civil: " + personas[i].getEstadoCivil());
            System.out.println("*************************************");
        }

    }

}
