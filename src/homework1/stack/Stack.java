package homework1.stack;

public class Stack {
    private final int[] stck = new int[10];
    private int tos;

    public Stack() {
        tos = -1;

    }

    public void push(int item) {
        if (tos == 9)
            System.out.println("стек заполнен");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {

            return 0;
        } else
            return stck[tos--];


    }

    public int getTos() {
        return tos;
    }
}
