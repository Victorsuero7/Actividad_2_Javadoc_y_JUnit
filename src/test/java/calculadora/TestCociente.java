package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCociente {

    @Test
    void dividir() throws Cociente.ZeroMathException {
        double resultado = Cociente.dividir(10, 2);
        assertEquals(5, resultado, "El valor esperado es de 5");
    }

    @Test
    void testDividir() throws Cociente.ZeroMathException {
        double resultado = Cociente.dividir(10.5, 3.5);
        assertEquals(3, resultado, "El valor esperado es de 3");
    }

    @Test
    void inverso() throws Cociente.ZeroMathException {
        double resultado = Cociente.inverso(7);
        assertEquals(0.14285714285714285, resultado, "El valor esperado es de 0.14285714285714285");
    }

    @Test
    void raiz() throws Cociente.NegativeSquareException {
        double resultado = Cociente.raiz(10);
        assertEquals(3.1622776601683795, resultado, "El valor esperado es de 3.1622776601683795");
    }
}