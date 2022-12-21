package lab21.task04;

public class AnyArray {
    Object[] arr;

    AnyArray(Object[] a) {
        arr = a.clone();
    }

    public Object getElementByIndex(int index) {
        return arr[index];
    }

}
