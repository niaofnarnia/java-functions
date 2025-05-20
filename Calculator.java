public class Calculator {
    
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        double sum = add(6.5, 7.8);
        System.out.println(sum);
        double difference = subtract(100, 33.4);
        System.out.println(difference);
        double product = multiply(8.7, 3.2);
        System.out.println(product);
        double quotient = divide(1, 29.35);
        System.out.println(quotient);
    }

    //Define los métodos basándote en su doc comment.

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */
    public static double add (double number1, double number2) {
        return number1 + number2;
    }
    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */
    public static double subtract (double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */
    public static double multiply (double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    public static double divide (double number1, double number2) {
        return number1 / number2;
    }

}
