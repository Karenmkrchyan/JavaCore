package classwork.chaprar2;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i ровно нулю");
                    break;
                case 1:
                    System.out.println("i ровно единици");
                    break;
                case 2:
                    System.out.println("i ровно двум");
                    break;
                case 3:
                    System.out.println("i ровно трем");
                    break;
                default:
                    System.out.println("i больше трех");
            }
    }
}
