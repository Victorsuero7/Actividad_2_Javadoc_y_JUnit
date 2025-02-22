/**
 * @author Juan Montiel (xmontiel@github.com)
 * @version 1.0
 */

package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Elija la operación matemática que desee");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicación");
        System.out.println("4 División");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Elija la operación matemática que desee");
                System.out.println("1 Resta de dos numeros reales");
                System.out.println("2 Resta de dos numeros enteros");
                System.out.println("3 Resta de tres numeros reales");
                System.out.println("4 Resta de numero acumulado");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca primer numero");
                        Resta resta1 = new Resta();
                        double numeroReal1 = 0;
                        double numeroReal2 = 0;
                        numeroReal1 = scanner.nextDouble();
                        resta1.setNumeroReal1(numeroReal1);
                        System.out.println("Introduzca segundo numero");
                        numeroReal2 = scanner.nextDouble();
                        resta1.setNumeroReal2(numeroReal2);
                        System.out.println("El resultado es " + resta1.resta2Reales());
                        break;
                    case 2:
                        System.out.println("Introduzca primer numero");
                        Resta resta2 = new Resta();
                        int numeroEntero1 = 0;
                        int numeroEntero2 = 0;
                        numeroEntero1 = scanner.nextInt();
                        resta2.setNumeroEntero1(numeroEntero1);
                        System.out.println("Introduzca segundo numero");
                        numeroEntero2 = scanner.nextInt();
                        resta2.setNumeroEntero2(numeroEntero2);
                        System.out.println("El resultado es " + resta2.resta2Enteros());
                        break;
                    case 3:
                        System.out.println("Introduzca primer numero");
                        Resta resta3 = new Resta();
                        double numeroReal3 = 0;
                        double numeroReal4 = 0;
                        double numeroReal5 = 0;
                        numeroReal3 = scanner.nextDouble();
                        resta3.setNumeroReal1(numeroReal3);
                        System.out.println("Introduzca segundo numero");
                        numeroReal4 = scanner.nextDouble();
                        resta3.setNumeroReal2(numeroReal4);
                        System.out.println("Introduzca tercer numero");
                        numeroReal5 = scanner.nextDouble();
                        resta3.setNumeroReal3(numeroReal5);
                        System.out.println("El resultado es " + resta3.resta3Reales());
                        break;
                    case 4:
                        System.out.println("Introduzca numeros para restarlos. Introduzca 999 para salir");
                        Resta resta4 = new Resta();
                        double numeroAcumulado = 0;
                        double numeroARestar = 0;

                        System.out.println(numeroAcumulado);
                        while (numeroARestar != 999) {
                            numeroARestar = scanner.nextDouble();
                            resta4.restaAcumulando(numeroARestar);
                            System.out.println(resta4.getNumeroAcumulado());
                        }
                        break;
                    default:
                        System.out.println("Opción erronea");
                }
                break;
            case 3:
                System.out.println("Multiplicación");
                break;
            case 4:
                System.out.println("División");
                break;
            default:
                System.out.println("Opción erronea");
        }
        scanner.close();
    }

}
