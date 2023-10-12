package classwork.chaptar5;

public class Simpleinheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        subOb.j = 20;
        System.out.println(" содержимое обекта superOb: ");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("содержимое обекта subOb  ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("sum i, j , and k in objekt subOb");

    }
}
