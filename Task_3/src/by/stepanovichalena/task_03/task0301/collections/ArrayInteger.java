package by.stepanovichalena.task_03.task0301.collections;

import java.util.Arrays;

public class ArrayInteger {
    private Integer[] array;
    private int size;

    public ArrayInteger(Integer[] array) {
        this.array = array;
        size = array.length;
    }

    public ArrayInteger(int[] array) {
        int arrayLength = array.length;
        Integer [] temp = new Integer[arrayLength];
        for (int i =0; i< arrayLength; i++){
            temp[i]=new Integer(array[i]);
        }
        this.array = temp;
        size = temp.length;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
        size = array.length;
    }

    public boolean contains(int number) {
        boolean result = false;
        for (int n : array) {
            if (n == number) {
                result = true;
            }
        }
        return result;
    }

    public boolean add(int number) {
        boolean result = false;
        if (size < array.length) {
            array[size] = number;
            size++;
            result = true;
        } else {
            increaseArraySize();
            array[size] = number;
            size++;
            result = true;
        }
        return result;
    }

    private void increaseArraySize() {
        int newCapacity = array.length + 1;
        array = copyOfArrayInteger(array, newCapacity);
    }

    private void reduceArraySize() {
        int oldCapacity = array.length;
        array = copyOfArrayInteger(array, oldCapacity - 1);
    }

    private Integer[] copyOfArrayInteger(Integer[] original, int newLength) {
        Integer[] copy = new Integer[newLength];
        System.arraycopy(original, 0, copy, 0,
                Math.min(original.length, newLength));
        return copy;
    }

    private void removeByIndex(int index) {
        if (index >= 0 && index < size) {
            if (index != size - 1) {
                int lastIndexOf = 0;
                for (int i = index; i < size - 1; i++) {
                    array[i] = array[i + 1];
                    lastIndexOf = i + 1;
                }
                array[lastIndexOf] = null;
                size--;
            } else {
                array[index] = null;
                size--;
            }
        }
    }

    public boolean remove(int number) {
        boolean result = false;
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    j = i;
                    removeByIndex(j);
                    reduceArraySize();
                    result = true;
                }
            }
        return result;
    }


    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
        array = Arrays.copyOf(array, size);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() != this.getClass() || o == null) return false;
        ArrayInteger that = (ArrayInteger) o;
        return Arrays.equals(getArray(), that.getArray());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(getArray());
        return result;
    }
}
