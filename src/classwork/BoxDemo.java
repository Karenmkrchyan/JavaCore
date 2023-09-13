package classwork;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.heigth = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.heigth * mybox.depth;
        System.out.println(" обем равеень" + vol);
    }
}
