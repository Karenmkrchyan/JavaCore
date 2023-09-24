package homework1.dynamicarrey;

public class DenamicArray {
    private int[] array = new int[10];
    private int size = 0;

    void add(int volue) {
        if (size == array.length) {
            extend();
        }
        array[size++] = volue;
    }

    void add(int index, int volue) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i > index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = volue;
        size++;
    }

    boolean exsist(int volue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == volue) {
                return true;
            }

        }
        return false;
    }

    void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];


        }
        size--;
    }

    void set(int index, int velue) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return;
        }
        array[index] = velue;
    }

    int getByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
            return 0;
        }
        return array[index];
    }

    int getIndexBYVolue(int volue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == volue) {
                return i;
            }

        }
        return -1;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, size);
        array = tmp;
    }

}
