package classwork.chaptar3;

public class OverLoadDemo {
    void test() {
        System.out.println("параметри отсуствует");
    }

    void test(int a) {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a b  : " + a + " " + b);
    }


    double test(double a) {
        System.out.println("doable a:" + a);
        return a * a;
    }
    //  void test(){
    //    System.out.println("внутренное переобразование при вызове  " + "test9double a):" + a);
    //}

}
