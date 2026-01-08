class AllDataTypes {
    public static void main(String[] args) {

        
        byte b = 100;
        short s = 10000;
        int i = 500000;
        long l = 10000000000L;

        float f = 10.5f;
        double d = 99.99;

        char c = 'A';
        boolean flag = true;

        String name = "Java Programming";

        int[] numbers = {10, 20, 30, 40};

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);

        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);

        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + flag);

        System.out.println("String value: " + name);

        System.out.println("Array values:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
