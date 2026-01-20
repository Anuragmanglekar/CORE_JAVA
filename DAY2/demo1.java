public class demo1 {
    public static void main(String[] args) {
        // Narrowing and Wideing
        // wideing--> convert Byte into Short

        byte b = 10;
        short s = b;
        double d = b;

        // another option
        short a = (short) b;

        // here (short)is typecasting it is optional in wideing
        System.out.println("Wideing --->");
        System.out.println("b:" + b);
        System.out.println("s:" + s);
        System.out.println("a:" + a);
        System.out.println("d:" + d);

        // Narrowing--> convert Short into Byte
        short c = 10;
        byte v = (byte) c;
        double r = 10.0;
        int t = (int) r;

        // here (byte)is typecasting it is reqired in narrowing
        System.out.println("Narrowing --->");
        System.out.println("c:" + c);
        System.out.println("v:" + v);
        System.out.println("r:" + r);
        System.out.println("t:" + t);

    }

}
