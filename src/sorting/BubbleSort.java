package sorting;

public class BubbleSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println(BubbleSort.class.getName() + " ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println(BubbleSort.class.getName() + " descending");
    }

    @Override
    public void showInfo() {
        System.out.println("버블입니다");
    }
}
