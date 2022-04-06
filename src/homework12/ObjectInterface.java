package homework12;

import java.util.Collection;

public interface ObjectInterface {
    boolean add(Object o);

    boolean add(int index, Object o);

    boolean delete();

    Object get(int index);

    boolean contain(Object o);

    boolean equals (Collection str);

    boolean clear();

    int size();
    boolean isEmpty();
    boolean contains(Object element);

}

