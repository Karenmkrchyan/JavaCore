package homework1;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");


            }
            System.out.println("*");
            System.out.println();
            System.out.println();
            {
                for (i = 5; i > 0; i--) {
                    for (int j = 5; j < i; j++) ;

                    System.out.println("*");
                }
                System.out.println("*");

            }
        }


    }

}

