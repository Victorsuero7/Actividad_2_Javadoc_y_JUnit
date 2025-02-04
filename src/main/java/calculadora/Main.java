/**
 * @Author Juan Montiel (xmontiel@github.com)
 * @version 0.1
 */

package calculadora;

public class Main {
    public static void main(String[] args) {

        //Test resta
        System.out.println("Test resta");
        //resta1 para comprobar el uso del constructor con todo.
        Resta resta1 = new Resta(1.5,0.5,2,3,4,5);
        System.out.println("Resta1: " + resta1);
        System.out.println("Resta de dos numeros reales: " + resta1.resta2Reales());
        System.out.println("Resta de dos numeros enteros: " + resta1.resta2Enteros());
        System.out.println("Resta de tres numeros reales: " + resta1.resta3Reales());
        System.out.println("Resta de numero acumulado:");
        System.out.print(resta1.getNumeroAcumulado() + " --> ");
        resta1.restaAcumulando(0.5);
        System.out.print(resta1.getNumeroAcumulado() + " --> ");
        resta1.restaAcumulando(0.5);
        System.out.print(resta1.getNumeroAcumulado() + " --> ");
        resta1.restaAcumulando(0.5);
        System.out.print(resta1.getNumeroAcumulado() + " --> ");
        resta1.restaAcumulando(1);
        System.out.print(resta1.getNumeroAcumulado() + " --> ");
        resta1.restaAcumulando(1.5);
        System.out.println(resta1.getNumeroAcumulado());

        //resta2 para comprobar el uso del constructor vacío
        Resta resta2 = new Resta();
        System.out.println("Resta2: " + resta2);
        System.out.println("Resta de dos numeros reales: " + resta2.resta2Reales(5.5,0.5));
        System.out.println("Resta de dos numeros enteros: " + resta2.resta2Enteros(4,2));
        System.out.println("Resta de tres numeros reales: " + resta2.resta3Reales(3,0.5,1.5));
        System.out.println("Resta de numero acumulado:");
        System.out.print(resta2.getNumeroAcumulado() + " --> ");
        resta2.restaAcumulando(1);
        System.out.print(resta2.getNumeroAcumulado() + " --> ");
        resta2.restaAcumulando(2);
        System.out.print(resta2.getNumeroAcumulado() + " --> ");
        resta2.restaAcumulando(3);
        System.out.print(resta2.getNumeroAcumulado() + " --> ");
        resta2.restaAcumulando(4);
        System.out.print(resta2.getNumeroAcumulado() + " --> ");
        resta2.restaAcumulando(-10.5);
        System.out.println(resta2.getNumeroAcumulado());
        System.out.println();
        //comprobamos que resulta mucho más práctico el uso del contructor vacío que del contructor con todo







    }
}
