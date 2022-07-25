package string;

/**
 * StringBuffer : 문자열이 안전하게 변경되도록 보장 (다중 쓰레드에 적합)
 * StringBuilder : 안전한 변경 보장하지 않음, 속도 빠름
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println("javaStr 문자열 주소 : "+ System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!");
        System.out.println("연산 후 buffer 메모리 주소 : "+System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 :"+ System.identityHashCode(javaStr));
    }
}
