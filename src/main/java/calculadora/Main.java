package calculadora;

public class Main {
    public static void main(String[] args) {

        /* TEST */
        double doubleMultiplyTwoParams = Multiply.doubleTwoParamsProduct(3.3, 1.5);
        int intMultiplyTwoParams = Multiply.intTwoParamsProduct(3, 3);
        double doubleMultiplyThreeParams = Multiply.doubleThreeParamsProduct(2.3, 7.2, 3.14);
        System.out.println(doubleMultiplyTwoParams);
        System.out.println(intMultiplyTwoParams);
        System.out.println(doubleMultiplyThreeParams);
    }
}
