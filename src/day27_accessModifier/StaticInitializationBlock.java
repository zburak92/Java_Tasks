package day27_accessModifier;

public class StaticInitializationBlock {
    public static int a;
    public static double b;
    public static String c;

    //public static ExcelSheet sheet;

    static{
        a = 100;
        b = 20.5;
        c = "Java";
        System.out.println("Static block");

    }

}
