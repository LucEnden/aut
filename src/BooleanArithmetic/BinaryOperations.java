package BooleanArithmetic;

public class BinaryOperations {
    public static Boolean logOperations = false;

    private static String[] paginateBinary(String binary1, String binary2) {
        int length1 = binary1.length();
        int length2 = binary2.length();
        if (length1 > length2) {
            binary2 = "0".repeat(length1 - length2) + binary2;
        } else if (length2 > length1) {
            binary1 = "0".repeat(length2 - length1) + binary1;
        }
        return new String[]{binary1, binary2};
    }

    // Addition
    public static String addition(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " addition() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    // Subtraction
    public static String subtraction(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " subtraction() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int difference = num1 - num2;
        return Integer.toBinaryString(difference);
    }

    // Multiplication
    public static String multiplication(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " multiplication() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int product = num1 * num2;
        return Integer.toBinaryString(product);
    }

    // Division
    public static String division(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " division() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int quotient = num1 / num2;
        return Integer.toBinaryString(quotient);
    }

    // Modulo
    public static String modulo(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " modulo() called with '" + binary1 + "' and '" + binary2 + "'");
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        if (num2 == 0) {
            throw new ArithmeticException("Modulo by zero");
        }
        int remainder = num1 % num2;
        return Integer.toBinaryString(remainder);
    }

    // BITWISE NOT
    public static String bitwiseNot(String binary) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " bitwiseNot() called with '" + binary + "'");
        String result = "";
        for (int i = 0; i < binary.length(); i++) {
            result += binary.charAt(i) == '0' ? "1" : "0";
        }
        return result;
    }

    // BITWISE AND
    public static String bitwiseAnd(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " bitwiseAnd() called with '" + binary1 + "' and '" + binary2 + "'");

        String[] paginated = paginateBinary(binary1, binary2);
        binary1 = paginated[0];
        binary2 = paginated[1];
        String result = "";

        for (int i = 0; i < binary1.length(); i++) {
            result += binary1.charAt(i) == '1' && binary2.charAt(i) == '1' ? "1" : "0";
        }
        return result;
    }

    // BITWISE XOR
    public static String bitwiseXor(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " bitwiseXor() called with '" + binary1 + "' and '" + binary2 + "'");

        String[] paginated = paginateBinary(binary1, binary2);
        binary1 = paginated[0];
        binary2 = paginated[1];
        String result = "";

        for (int i = 0; i < binary1.length(); i++) {
            result += binary1.charAt(i) != binary2.charAt(i) ? "1" : "0";
        }
        return result;
    }

    // BITWISE OR
    public static String bitwiseOr(String binary1, String binary2) {
        if (logOperations) System.out.println(BinaryOperations.class.getName() + " bitwiseOr() called with '" + binary1 + "' and '" + binary2 + "'");

        String[] paginated = paginateBinary(binary1, binary2);
        binary1 = paginated[0];
        binary2 = paginated[1];
        String result = "";

        for (int i = 0; i < binary1.length(); i++) {
            result += binary1.charAt(i) == '1' || binary2.charAt(i) == '1' ? "1" : "0";
        }
        return result;
    }

    // ROTATE RIGHT
    public static String rotateRight(String binary1, String binary2) {
        int shift = Integer.parseInt(binary2, 2);
        String[] result = binary1.split("");

        for (int i = 0; i < shift; i++) {
            String last = result[result.length - 1];
            System.arraycopy(result, 0, result, 1, result.length - 1);
            result[0] = last;
        }

        return String.join("", result);
    }

    // ROTATE LEFT
    public static String rotateLeft(String binary1, String binary2) {
        int shift = Integer.parseInt(binary2, 2);
        String[] result = binary1.split("");

        for (int i = 0; i < shift; i++) {
            String first = result[0];
            System.arraycopy(result, 1, result, 0, result.length - 1);
            result[result.length - 1] = first;
        }

        return String.join("", result);
    }

    // ARITHMETIC RIGHT SHIFT
    public static String arithmeticRightShift(String binary1, String binary2) {
        int shift = Integer.parseInt(binary2, 2);
        String[] result = binary1.split("");
        return arsRecursion(result, shift);
    }
    private static String arsRecursion(String[] binary, int shift) {
        for (int j = binary.length - 2; j >= 0; j--) {
            binary[j+1] = binary[j];
        }

        shift -= 1;
        if (shift > 0) {
            return arsRecursion(binary, shift);
        } else {
            return String.join( "", binary);
        }
    }

    public static String arithmeticLeftShift(String binary1, String binary2) {
        int shift = Integer.parseInt(binary2, 2);
        String[] result = binary1.split("");
        return alsRecursion(result, shift);
    }
    private static String alsRecursion(String[] binary, int shift) {
        for (int i = 0; i < binary.length - 1; i++) {
            binary[i] = binary[i+1];
        }
        binary[binary.length - 1] = "0";

        shift -= 1;
        if (shift > 0) {
            return arsRecursion(binary, shift);
        } else {
            return String.join( "", binary);
        }
    }

    public static void main(String[] args) {
        // System.out.println(arithmeticRightShift("10010111", "1")); // 11001011
        // System.out.println(arithmeticLeftShift("00010111", "1")); // 00101110
    }
}
