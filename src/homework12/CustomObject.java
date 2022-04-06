package homework12;

import java.util.Collection;

public class CustomObject implements ObjectInterface {
    private final int initialSize = 10;
    private Object array [] = new Object[initialSize];
    private int elementsInArray = 0;
    ////////////////////////
    @Override
    public boolean add(Object o) {
        if (elementsInArray == array.length - 1) {
            resize(array.length * 2);
        }
        array[elementsInArray++] = o;

        return true;
    }



    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    public boolean contains(Object element) {
        if (element == null) {
            for (Object o : this.array) {
                if (o == null) {
                    return true;
                }
            }
        } else {
            for (Object o : this.array) {
                if (element.equals(o)) {
                    return true;
                }
            }
        }

        return false;
    }

    /////////////////////////////
    @Override
    public boolean add(int index, Object o) {
        if (array.length < index + 4) {
            resize(array.length + index + 4);
        }
        if (array[index] != null) {
            resize(array.length + 1);
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
        } else array[index] = o;
        array[index] = o;
        elementsInArray++;


        return true;
    }

    ////////////////////////
    @Override
    public boolean delete() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                break;
            } else {
                i++;
            }
        }
        elementsInArray--;
        return true;
    }

    ///////////////////////////
    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public boolean contain(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean equals(Collection str) {

        return false;
    }

    /////////////////////////////////
    @Override
    public boolean clear() {

        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        if ((array.length > initialSize) && (elementsInArray < array.length / 4)) {
            resize(array.length / 2);// уменьшить массив, чтобы он безмерно не рос
        }
        elementsInArray = 0;
        return true;
    }

    /////////////////////////////////
    @Override
    public int size() {
        return elementsInArray;
    }


    private void resize(int newLength) {
        java.lang.Object[] newArray = new java.lang.Object[newLength];
        System.arraycopy(array, 0, newArray, 0, elementsInArray);
        array = newArray;
    }

}

