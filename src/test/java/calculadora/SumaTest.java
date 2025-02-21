package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    private Suma suma;
    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    void testSumaDosNumRealsPositivo() {

        // Dado (GIVEN)
        double num1 = 6.0;
        double num2 = 2.0;
        double resultadoEsperado = 8.0;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaDosNumReals(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser 8.0");
    }

    @Test
    void testSumaDosNumRealsCero() {

        // Dado (GIVEN)
        double num1 = 0.0;
        double num2 = 0.0;
        double resultadoEsperado = 0.0;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaDosNumReals(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser 0.0");
    }

    @Test
    void testSumaDosNumRealsNegativo() {

        // Dado (GIVEN)
        double num1 = -6.0;
        double num2 = -2.0;
        double resultadoEsperado = -8.0;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaDosNumReals(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser -8.0");

    }

    @Test
    void testSumaDosNumRealsMixto() {

        // Dado (GIVEN)
        double num1 = 6.0;
        double num2 = -2.0;
        double resultadoEsperado = 4.0;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaDosNumReals(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "Debe manejar positivos y negativos, el resultado debe ser 4.0");
    }

    @Test
    void testSumaDosEnterosPositivo() {

        // Dado (GIVEN)
        int num1 = 6;
        int num2 = 2;
        int resultadoEsperado = 8;

        // Cuando (WHEN)
        int resultadoActual = suma.sumaDosEnteros(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser 8");

    }

    @Test
    void testSumaDosEnterosCero() {
        int num1 = 0;
        int num2 = 0;
        int resultadoEsperado = 0;

        // Cuando (WHEN)
        int resultadoActual = suma.sumaDosEnteros(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser 0");
    }

    @Test
    void testSumaDosEnterosNegativo() {

        // Dado (GIVEN)
        int num1 = -10;
        int num2 = -20;
        int resultadoEsperado = -30;

        // Cuando (WHEN)
        int resultadoActual = suma.sumaDosEnteros(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser -30");
    }

    @Test
    void testSumaDosEnterosMixto() {

        // Dado (GIVEN)
        int num1 = 10;
        int num2 = -20;
        int resultadoEsperado = -10;

        // Cuando (WHEN)
        int resultadoActual = suma.sumaDosEnteros(num1, num2);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "Debe manejar positivos y negativos, el resultado debe ser -10");
    }

    @Test
    void testSumaTresNumRealsPositivo() {

        // Dado (GIVEN)
        double num1 = 2.5;
        double num2 = 3.0;
        double num3 = 4.0;
        double resultadoEsperado = 9.5;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaTresNumReals(num1, num2, num3);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser 9.5");
        
    }

    @Test
    void testSumaTresNumRealsCero() {

        // Dado (GIVEN)
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;
        double resultadoEsperado = 0.0;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaTresNumReals(num1, num2, num3);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser 0.0");
    }

    @Test
    void testSumaTresNumRealsNegativo() {

        // Dado (GIVEN)
        double num1 = -2.5;
        double num2 = -3.0;
        double num3 = -4.0;
        double resultadoEsperado = -9.5;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaTresNumReals(num1, num2, num3);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "el resultado debe ser -9.5");
    }

    @Test
    void testSumaTresNumRealsMixto() {

        // Dado (GIVEN)
        double num1 = 10.0;
        double num2 = -5.0;
        double num3 = 20.0;
        double resultadoEsperado = 25;

        // Cuando (WHEN)
        double resultadoActual = suma.sumaTresNumReals(num1, num2, num3);

        // Entonces (THEN)
        assertEquals(resultadoEsperado, resultadoActual, "Debe manejar positivos y negativos, el resultado debe ser 25");
    }

    @Test
    void testSumaAcumuladoConValorPrevio() {

        // Dado (GIVEN)
        suma.setNumAcumulado(10.0);

        //Cuando (WHEN)
        double resultado = suma.sumaAcumulado(6.0);

        //Entonces (THEN)
        assertEquals(16.0,resultado, "Al iniciarlo con 10.0, el resultado debe ser: 10.0 + 6.0 = 16.0");


    }

    @Test
    void testSumaAcumuladoConValorInicialCero() {

        // Dado (GIVEN)
        suma.setNumAcumulado(0.0);

        // Cuando (WHEN)
        double resultado = suma.sumaAcumulado(9.0);

        // Entonces (THEN)
        assertEquals(9.0,resultado, "Al iniciarlo a 0.0, el resultado debe ser 0.0 + 9.0 = 9.0");
    }

    @Test
    void testSumaAcumuladoValorNegativo() {

        // Dado (GIVEN)
        suma.setNumAcumulado(10.0);

        // Cuando (WHEN)
        double resultado = suma.sumaAcumulado(-9.0);

        // Entonces (THEN)
        assertEquals(1.0, resultado, "Debe poder acumular con números negativos, el resultado debe ser 10.0 + (-9.0) = 1.0");
    }

    @Test
    void testSumaAcumuladoCero() {

        // Dado (GIVEN)
        suma.setNumAcumulado(20.0);

        // Cuando (WHEN)
        double resultado = suma.sumaAcumulado(0.0);

        // Entonces (THEN)
        assertEquals(20.0, resultado, "Al poner la suma acumulada a 0.0, el resultado debe ser 20.0 + 0.0 = 20.0");
    }

    @Test
    void testSumaAcumuladoMultiples() {

        // Dado (GIVEN)
        suma.sumaAcumulado(10.0);
        suma.sumaAcumulado(6.0);
        suma.sumaAcumulado(36.0);
        suma.sumaAcumulado(36.0);

        // Cuando (WHEN)
        double resultado = suma.getNumAcumulado();

        // Entonces (THEN)
        assertEquals(88.0, resultado, "Llamamos al método varias veces para comprobar que acumula las sumas, el resultado debe ser 88.0");
    }
}