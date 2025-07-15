/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessons;

/**
 *
 * @author PC
 */
public class DataTypesPrimitive {

    public static void run() {
        byte b1 = 10;
        short s1 = 200;
        int i1 = 1000;
        long l1 = 100_000L;
        long l2 = 100_000;
        float f1 = 5.75f;
        //float f2 = 5.75; // incompatible types: possible lossy convertion from double to float
        double d1 = 19.99;
        char c1 = 'A';
        boolean bool1 = true;
        boolean bool2 = false;
        //boolean bool3 = True; // cannot find symbol

        // Cannot check primitive types at runtime, but can check wrappers like Integer
        System.out.println(((Object) b1).getClass().getName()); // java.lang.Byte
        System.out.println(((Object) s1).getClass().getName()); // java.lang.Short
        System.out.println(((Object) i1).getClass().getName()); // java.lang.Integer
        System.out.println(((Object) l1).getClass().getName()); // java.lang.Long
        System.out.println(((Object) l2).getClass().getName()); // java.lang.Long
        System.out.println(((Object) f1).getClass().getName()); // java.lang.Float
        System.out.println(((Object) d1).getClass().getName()); // java.lang.Double
        System.out.println(((Object) c1).getClass().getName()); // java.lang.Character 
        System.out.println(((Object) bool1).getClass().getName()); // java.lang.Boolean 
        System.out.println(((Object) bool2).getClass().getName()); // java.lang.Boolean
    }
}
