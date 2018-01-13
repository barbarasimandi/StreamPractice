import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Excercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

            Double avg = numbers.stream()
                .filter(integer -> integer % 2 != 0)
                .collect(Collectors.averagingInt(Integer -> Integer));

            System.out.println(avg);
    }
}
