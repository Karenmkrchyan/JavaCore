package homework1;

public class ArreyUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int result = 0;
        for (int i = 0; i < numbers.length; i++)
            result = result + numbers[i];
        System.out.println("թվերի միջին թվաբանական" + " " + "=" + " " + result / numbers.length);
        System.out.println(numbers[numbers.length - 1]);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println(numbers[0]);


    }
}
