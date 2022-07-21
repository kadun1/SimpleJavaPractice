package sorting;

public class HeapSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println(HeapSort.class.getName() + " ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println(HeapSort.class.getName() + " descending");
    }

    @Override
    public void showInfo() {
        System.out.println("힙입니다");
    }
}
