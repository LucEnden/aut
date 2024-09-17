package BooleanArithmetic;

public class BinaryOperations {
    // Addition
    public static String addBinary(String binary1, String binary2) {
        System.out.println(BinaryOperations.class.getName() + " addBinary() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    // Subtraction
    public static String subtractBinary(String binary1, String binary2) {
        System.out.println(BinaryOperations.class.getName() + " subtractBinary() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int difference = num1 - num2;
        return Integer.toBinaryString(difference);
    }

    // Multiplication
    public static String multiplyBinary(String binary1, String binary2) {
        System.out.println(BinaryOperations.class.getName() + " multiplyBinary() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int product = num1 * num2;
        return Integer.toBinaryString(product);
    }

    // Division
    public static String divideBinary(String binary1, String binary2) {
        System.out.println(BinaryOperations.class.getName() + " divideBinary() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int quotient = num1 / num2;
        return Integer.toBinaryString(quotient);
    }

    // Modulo
    public static String moduloBinary(String binary1, String binary2) {
        System.out.println(BinaryOperations.class.getName() + " moduloBinary() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        if (num2 == 0) {
            throw new ArithmeticException("Modulo by zero");
        }
        int remainder = num1 % num2;
        return Integer.toBinaryString(remainder);
    }

    // NOT
    public static String notBinary(String binary) {
        System.out.println(BinaryOperations.class.getName() + " notBinary() called with '" + binary + "'");
        String result = "";
        for (int i = 0; i < binary.length(); i++) {
            result += binary.charAt(i) == '0' ? "1" : "0";
        }
        return result;
    }
}
