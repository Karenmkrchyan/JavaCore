package homework1.dynamicarrey;

public class DenamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 5000; i++) {
            dy.add(i + 1);

        }
        dy.print();
    }
}
