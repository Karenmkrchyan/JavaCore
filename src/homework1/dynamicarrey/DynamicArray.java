package homework1.dynamicarrey;

public class DynamicArray {
    int[] arrey = new int[10];

    int size = 0;

    void add() {
        if (size == arrey.length) {
            extent();

        }

    }

    void extent() {
        int[] tmp = new int[arrey.length + 10];
        if (size >= 0) System.arraycopy(arrey, 0, tmp, 0, size);
        arrey = tmp;
    }

    int getByIndex(int index) {
        return 0;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arrey[i] + " ");

        }

    }


    public void add(int i) {
        if (size == arrey.length) {
            extent();

        }
    }

}