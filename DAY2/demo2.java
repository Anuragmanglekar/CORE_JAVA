public class demo2 {
    public static void main(String[] args) {
        /*
         * wrapper class
         * Every primitive class has class given in java
         * example: java.lang.Boolean
         * java.lang.Byte
         * java.lang.Short
         * java.lang.Integer
         * java.lang.Double
         * java.lang.Float
         * wrapper class is for boxing and unboxing
         * 
         */

        int a = 10;
        // Integer i = new Integer(a); //boxing
        Integer i = a; // autoboxing

        System.out.println("a:" + a);
        System.out.println("i:" + i);

        // type-conversion or unboxing
        int b = i.intValue(); // unboxing
        // int b=i; autoboxing
        System.out.println("b:" + b);// convert wrapper class into primitive class

        double d = i.doubleValue();
        System.out.println("d:" + d);// convert integer wrapper class into double primitive class

        float f = i.floatValue();
        System.out.println("f:" + f);// convert integer wrapper class into float primitive class

    }

}
