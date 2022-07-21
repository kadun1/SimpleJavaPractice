package sorting;

public class QuickSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println(QuickSort.class.getName() + " ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println(QuickSort.class.getName() + " descending");
    }

    @Override
    public void showInfo() {
        System.out.println("퀵입니다");
    }
}
