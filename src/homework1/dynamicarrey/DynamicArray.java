package homework1.dynamicarrey;

public class DynamicArray {
    int[] arrey = new int[10];

    int size = 0;

    void add(int value) {
        if (size == arrey.length) {
            extent();
        }
        arrey[size++] = value;

        }


    private void extent() {
        int[] tmp = new int[arrey.length + 10];
        if (size >= 0) System.arraycopy(arrey, 0, tmp, 0, size);
        arrey = tmp;
    }

    int getByIndex(int index) {
        return arrey[index];
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arrey[i] + " ");

        }

    }
}