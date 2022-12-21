package lab20.task1_3;

import java.io.Serializable;

public class Generalized<T extends Comparable, V extends Animal & Serializable, K> {
    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    T t;
    V v;
    K k;
    public Generalized(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void printClassNames() {
        System.out.println("Class name of T is " + t.getClass());
        System.out.println("Class name of V is " + v.getClass());
        System.out.println("Class name of K is " + k.getClass());
    }

}
