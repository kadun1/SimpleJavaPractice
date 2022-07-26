package classex;

import java.lang.reflect.InvocationTargetException;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("classex.Person");
        Person person2 = (Person) pClass.newInstance(); //deprecated
        Person person3 = (Person) pClass.getDeclaredConstructor().newInstance();
        System.out.println(person2);
        System.out.println(person3);
    }
}
