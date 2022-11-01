public class Main {
    public static void main(String[] args) {
        System.out.println("Bitwise Operator!");
        int a = 12;  // 0000 0101
        int b = 25;  // 0000 0010
        int c = 35;  // 0010 0011
        int d = 2;   // 0000 0010
        int e = 8;   // 0000 1000
        int f = 8;   //

        int val;
        String name = "Mark";
        int age = 25;
        boolean result = name instanceof String;

        val = a&b;
        System.out.println("Output of Bitwise AND: " +val);

        val = a|b;
        System.out.println("Output of Bitwise OR: " +val);

        val = a^b;
        System.out.println("Output of Bitwise XOR: " +val);

        val = ~c;
        System.out.println("Output of Bitwise ~:" +val);

        val = d<<8;
        System.out.println("Output of Bitwise Signed Left Shift: " +val);

        val = e>>3;
        System.out.println("Output of Bitwise Signed Right Shift: " +val);

        val = f>>>2;
        System.out.println("Output of Bitwise Unsigned Right Shift: " +val);

        System.out.println("name us an instance of String: " +result);

    }
}