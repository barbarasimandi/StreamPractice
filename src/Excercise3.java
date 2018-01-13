import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        List<Integer> squared = numbers.stream()
                .filter(integer -> integer.toString().charAt(0) != '-')
                .map(integer -> integer * integer)
                .collect(Collectors.toList());

        System.out.println(squared);

        // or
        List<Integer> squared2 = numbers.stream()
                .filter(integer -> integer > 0)
                .map(integer -> integer * integer)
                .collect(Collectors.toList());

        System.out.println(squared2);
    }
}
