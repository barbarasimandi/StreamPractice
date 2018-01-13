import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        List<Double> root = numbers.stream()
                .map(i -> i * i)
                .filter(i -> i > 20)
                .map(Math::sqrt)
                .collect(Collectors.toList());

        System.out.println(root);
    }

}
