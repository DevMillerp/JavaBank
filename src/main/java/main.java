public class main {
//    public static void main(String[] args){
//        System.out.println("Hola mundo");
//    }
//}

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Genera una excepción
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!");
        }
    }
}