package com.algorythmic.tasks.hackerrank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Test {


    static class T1 {
        String name;

        public T1(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            T1 t1 = (T1) o;
            return Objects.equals(name, t1.name);
        }

        @Override
        public int hashCode() {
            return new Random().nextInt();
        }
    }
    public static void main(String[] args) {
        Set<T1> set = new HashSet<>();
        T1 t = new T1("x");
        set.add(t);
        System.out.println(t.hashCode() + " " + hash(t));
//        t.name = "y";
        System.out.println(t.hashCode() + " " + hash(t));

        set.add(t);
        System.out.println(set.size());
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
