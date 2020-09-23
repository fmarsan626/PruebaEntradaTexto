/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaentradatexto;

/**
 *
 * @author Francisco Marcos Sánchez <franmarcos91@gmail.com>
 */
//Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;

public class PruebaEntradaTexto
{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido

        Scanner sc = new Scanner(System.in);

        // entrada de una cadena
        String name = sc.nextLine();

        // entrada de un carácter
        char gender = sc.next().charAt(0);

        // Entrada de datos numéricos
        // byte, short y float
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double average = sc.nextDouble();

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: "+name);
        System.out.println("Género: "+gender);
        System.out.println("Edad: "+age);
        System.out.println("Teléfono: "+mobileNo);
        System.out.println("Promedio: "+average);
    }
}

