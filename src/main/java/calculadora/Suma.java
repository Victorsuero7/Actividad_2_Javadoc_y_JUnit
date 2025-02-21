

package calculadora;
/**
 * Esta clase implementará todos los métodos que están relacionados con la suma de la calculadora. Esta
 * clase tendrá los siguientes métodos:
 * 1. Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * 2. Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * 3. Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
 * ---
 * Clase solicitada para realizar la suma.
 *
 * @author Stephen Nicholas Jones De Giorgi -- github: https://github.com/L0cksat
 * @version 0.1
 */

public class Suma {

    private double numReal1;
    private double numReal2;
    private double numReal3;
    private int numEntero1;
    private int numEntero2;
    private double numAcumulado;

    /*
     * Ahora añadimos el constructor con todos los parámetros.
     */

    public Suma(double numReal1, double numReal2, double numReal3, int numEntero1, int numEntero2, double numAcumulado) {
        this.numReal1 = numReal1;
        this.numReal2 = numReal2;
        this.numReal3 = numReal3;
        this.numEntero1 = numEntero1;
        this.numEntero2 = numEntero2;
        this.numAcumulado = numAcumulado;
    }

    /*
     * Ahora añadimos el constructor sin ningún parámetros.
     */

    public Suma() {
    }

    /*
     * Ahora generamos los getter and setter de la clase
     */

    public double getNumReal2() {
        return numReal2;
    }

    public void setNumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }

    public double getNumReal1() {
        return numReal1;
    }

    public void setNumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }

    public double getNumReal3() {
        return numReal3;
    }

    public void setNumReal3(double numReal3) {
        this.numReal3 = numReal3;
    }

    public int getNumEntero1() {
        return numEntero1;
    }

    public void setNumEntero1(int numEntero1) {
        this.numEntero1 = numEntero1;
    }

    public int getNumEntero2() {
        return numEntero2;
    }

    public void setNumEntero2(int numEntero2) {
        this.numEntero2 = numEntero2;
    }

    public double getNumAcumulado() {
        return numAcumulado;
    }

    public void setNumAcumulado(double numAcumulado) {
        this.numAcumulado = numAcumulado;
    }

    /*
     * Reescribimos el toString.
     */

    @Override
    public String toString() {
        return "Suma{" +
                "numReal1=" + numReal1 +
                ", numReal2=" + numReal2 +
                ", numReal3=" + numReal3 +
                ", numEntero1=" + numEntero1 +
                ", numEntero2=" + numEntero2 +
                ", numAcumulado=" + numAcumulado +
                '}';
    }

    /**
     * /**
     *      * Suman dos o tres números reales y dos números enteros:
     *      * @param numReal1 el primer número real a sumar.
     *      * @param numReal2 el segundo número real a sumar.
     *      * @param numReal3 el tercer número real a sumar.
     *      * @param numEntero1 el primer número entero a sumar.
     *      * @param numEntero2 el segundo número entero a sumar.
     *      * @param numAcumulado los números acumulados.
     *      * @return devuelve la suma de los parámetros anteriormente declarados.
     *      */



    public double sumaDosReals(){
        return numReal1 + numReal2;
    }

    public double sumaDosNumReals(double numReal1, double numReal2){
        this.numReal1 = numReal1;
        this.numReal2 = numReal2;
        return numReal1 + numReal2;
    }

    /*
    Ahora creamos un el segundo metodo para sumar dos números enteros y devolver el resultado.
     */

    public int sumaDosEnteros(){
        return numEntero1 + numEntero2;
    }

    public int sumaDosEnteros(int numEntero1, int numEntero2){
        this.numEntero1 = numEntero1;
        this.numEntero2 = numEntero2;
        return numEntero1 + numEntero2;
    }

    /*
    Ahora creamos el tercer metodo para sumar tres numeros reales y devolver el resultado.
     */

        public double sumaTresReals(){
            return numReal1 + numReal2 + numReal3;
        }

        public double sumaTresNumReals(double numReal1, double numReal2, double numReal3){
            this.numReal1 = numReal1;
            this.numReal2 = numReal2;
            this.numReal3 = numReal3;
            return numReal1 + numReal2 + numReal3;
        }

        /*
        Ahora creamos el ultimo metodo de una suma acumulado, donde se acumularán los números para la suma.
         */
    public double sumaAcumulado(double numSumar){
        numAcumulado += numSumar;
        return numAcumulado;
    }
}
