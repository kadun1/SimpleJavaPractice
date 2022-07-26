package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");

//        Constructor[] cons = strClass.getConstructors();
//        for (Constructor c : cons) {
//            System.out.println(c);
//        }
//
//        System.out.println();
//        Field[] fields = strClass.getFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }
//        System.out.println();
//
//        Method[] methods = strClass.getMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }


        Class personClass = Class.forName("classex.Person");

        Constructor[] cons2 = personClass.getConstructors();
        for (Constructor c : cons2) {
            System.out.println(c);
        }

        System.out.println();
        Field[] fields2 = personClass.getFields();
        for (Field f : fields2) {
            System.out.println(f);
        }
        System.out.println();

        Method[] methods2 = personClass.getMethods();
        for (Method m : methods2) {
            System.out.println(m);
        }

    }
}
