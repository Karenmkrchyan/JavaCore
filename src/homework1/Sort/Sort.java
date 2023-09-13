package homework1.Sort;

public class Sort {
    public static void main(String[] args) {

        {
            int[] arrey = {4, 7, 1, 3, 9, 0, 2};

            int num;
            boolean sort = true;
            while (sort) {
                sort = false;
                for (int i = 0; i < arrey.length - 1; i++) {
                    if (arrey[i] > arrey[i + 1]) {
                        num = arrey[i];
                        arrey[i] = arrey[i + 1];
                        arrey[i + 1] = num;
                        sort = true;
                    }
                }
            }

            for (int i : arrey) {
                System.out.println(i);

            }
        }
    }
}