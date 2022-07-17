package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer c1 = new Computer(); //추상클래스에서는 구현된 내용이 없기때문에 인스턴스화 할수없다.
        Computer c2 = new DeskTop();
//        Computer c3 = new NoteBook(); // 마찬가지
        Computer c4 = new MyNoteBook();
    }
}
