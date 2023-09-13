package classwork;

public class BoxDemo2 {
    public static void main(String[] args) {


        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.heigth = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.heigth = 6;
        mybox2.depth = 9;
        vol = mybox1.width * mybox1.heigth * mybox2.depth;
        System.out.println("обем рлвень " + vol);
        vol = mybox2.width * mybox2.heigth * mybox2.depth;
        System.out.println("обем ровень " + vol);
        Box b1 = new Box();
        Box b2 = b1;
    }
}