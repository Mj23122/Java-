public class OperatorsDemo {
    public static void main(String[] args) {

        // --- 1. ARITHMETIC OPERATORS (+, -, *, /, %) ---
        System.out.println("--- Arithmetic Operators ---");
        int a = 15;
        int b = 4;

        System.out.println("Addition (a + b): " + (a + b));          // 19
        System.out.println("Subtraction (a - b): " + (a - b));       // 11
        System.out.println("Multiplication (a * b): " + (a * b));    // 60
        System.out.println("Division (a / b): " + (a / b));          // 3 (Integer division drops decimals)
        System.out.println("Modulus/Remainder (a % b): " + (a % b)); // 3 (15 divided by 4 leaves a remainder of 3)
        System.out.println();

        // --- 2. RELATIONAL OPERATORS (>, <, ==, !=) ---
        System.out.println("--- Relational Operators ---");
        int x = 10;
        int y = 20;

        System.out.println("Is x greater than y? (x > y): " + (x > y));     // false
        System.out.println("Is x less than y? (x < y): " + (x < y));        // true
        System.out.println("Is x equal to y? (x == y): " + (x == y));       // false
        System.out.println("Is x not equal to y? (x != y): " + (x != y));   // true
        System.out.println();

        // --- 3. LOGICAL OPERATORS (&&, ||, !) ---
        System.out.println("--- Logical Operators ---");
        boolean condition1 = true;
        boolean condition2 = false;

        // AND (&&): True ONLY if both are true
        System.out.println("Logical AND (condition1 && condition2): " + (condition1 && condition2)); // false

        // OR (||): True if AT LEAST ONE is true
        System.out.println("Logical OR (condition1 || condition2): " + (condition1 || condition2));  // true

        // NOT (!): Reverses the boolean value
        System.out.println("Logical NOT (!condition1): " + (!condition1));                         // false
    }
}
