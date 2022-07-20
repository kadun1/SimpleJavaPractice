package interfaceex;

public interface Calc {
    double PI = 3.14;
    int ERROR = -00000000;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    int square(int num);

    default void description() {
        System.out.println("정수 계산기를 구현합니다");
    }
}
