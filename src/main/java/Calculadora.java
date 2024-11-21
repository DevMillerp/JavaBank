import java.util.Scanner;

public class Calculadora {


    Scanner scanner = new Scanner(System.in);


    public void start() {
        System.out.println("Ingrese el pimer numero:");
        double oneNumber = scanner.nextDouble();

        System.out.println("Ingrese el Segundo numero:");
        double twoNumber = scanner.nextDouble();

        System.out.println("Seleccione un simbolo u operacion (+,-,*,/)");
        String symbolOperation = scanner.next();

        double result;
        switch (symbolOperation) {
            case "+":
                result = add(oneNumber, twoNumber);
                break;
            case "-":
                result = substract(oneNumber, twoNumber);
                break;
            case "*":
                result = multiply(oneNumber, twoNumber);
                break;
            case "/":
                result = divide(oneNumber, twoNumber);
                break;
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
        System.out.println("El resultado es: " + result);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("División por cero no es posible.");
            return 0;
        }
        return a / b;


    }
}
