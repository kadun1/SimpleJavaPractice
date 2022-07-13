package array;

public class TwoDimensionAlphabet {
    public static void main(String[] args) {
        char[][] charArr = {{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'}, {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}};

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                System.out.print(charArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
