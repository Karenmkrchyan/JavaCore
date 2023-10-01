package homework1.bracecheker;

public class BraceChekerTest {
    public static void main(String[] args) {
        String text = "{Hello( {{java})";
        BraceCheker braceCheker = new BraceCheker(text);
        braceCheker.check();
    }
}
