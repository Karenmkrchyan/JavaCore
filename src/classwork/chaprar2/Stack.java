package classwork.chaprar2;

public class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;

    }

    void push(int item) {
        if (tos == 9)
            System.out.println("стек заполнен");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("стек не загружен");
            return 0;
        } else
            return stck[tos--];


    }
}