package lab20.task04;

public class MinMax<E extends Comparable> {
    private E[] arr;

    MinMax(E[] arr) {
        this.arr = arr;
    }

    public E findMax() {
        E max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public E findMin() {
        E min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        return min;
    }
}
