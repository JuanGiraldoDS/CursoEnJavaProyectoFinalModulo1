package ProyectoFinalModulo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu = "Bienvenido al cifrado César.\nEscoge una opción:\n1. Cifrar un texto\n2. Descifrar un texto\n3.salir \n";
        int opcion, clave;
        String texto;

        Cesar cesar = new Cesar();
        Scanner scanner = new Scanner(System.in);

        System.out.println(menu);
        System.out.println("Por favor elegir una opcion de 1 a 3: ");

        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el texto o palabra que desea cifrar: ");
                texto = scanner.nextLine();
                System.out.print("Ingrese la clave de desplazamiento (entre 1 y 25): ");
                clave = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                String textoCifrado = cesar.cifrar(texto, clave);
                System.out.println("Texto o palabra de cifrado: " + textoCifrado);

                break;
            case 2:
                System.out.print("Ingrese el texto o palabra de cifrado: ");
                texto = scanner.nextLine();
                System.out.print("Ingrese la clave de desplazamiento (entre 1 y 25): ");
                clave = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                String textoDescifrado = cesar.descifrar(texto, clave);
                System.out.println("Texto o palabra descifrado: " + textoDescifrado);

                break;

            case 3:
                System.out.println("Hasta la proxima");
                scanner.close();
                break;

            default:
                System.out.println("Opción inválida.Ingrese la opcion correcta");

        }
    }


}



