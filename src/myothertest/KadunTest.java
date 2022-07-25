package myothertest;

public class KadunTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Kadun kadun = new Kadun("희나리", 35, SEX.MALE);

        Kadun kadun2 = (Kadun) kadun.clone();

        System.out.println(kadun2.name);

        kadun.setName("흰아리");
        System.out.println(kadun.name);
        System.out.println(kadun2.name);


    }
}
