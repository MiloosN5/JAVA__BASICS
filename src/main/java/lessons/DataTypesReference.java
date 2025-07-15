/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessons;

/**
 *
 * @author PC
 */
public class DataTypesReference {

    public static class CustomClass { }

    public interface CustomInterface { }

    public static void run() {
        String str1 = "Hello, Java!";

        int[] arr1 = {1, 5, 9};
        String[] arr2 = {"blue", "red", "purple"};
        boolean[] arr3 = {false, false, true};
        float[] arr4 = {0.3f, 0.779f, 3.1f};
        double[] arr5 = {0.56, 2.22, 4.5632, 1.992};

        CustomClass obj1 = new CustomClass();

        System.out.println(str1.getClass().getName()); // java.lang.String
        System.out.println(arr1.getClass().getName()); // [I
        System.out.println(arr2.getClass().getName()); // [Ljava.lang.String;
        System.out.println(arr3.getClass().getName()); // [Z
        System.out.println(arr4.getClass().getName()); // [F
        System.out.println(arr5.getClass().getName()); // [D
        System.out.println(obj1.getClass().getName()); // lessons.DataTypesReference$CustomClass
    }
}
