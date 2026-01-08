class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        System.out.println("Post Increment (a++): " + (a++));
        System.out.println("Value of a after increment: " + a);

        System.out.println("Post Decrement (b--): " + (b--));
        System.out.println("Value of b after decrement: " + b);

        a += 5;   // a = a + 5
        System.out.println("a after a += 5: " + a);

        a -= 2;   // a = a - 2
        System.out.println("a after a -= 2: " + a);

        a *= 3;   // a = a * 3
        System.out.println("a after a *= 3: " + a);

        a /= 4;   // a = a / 4
        System.out.println("a after a /= 4: " + a);

        a %= 3;   // a = a % 3
        System.out.println("a after a %= 3: " + a);
    }
}
