import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Excercise6 {
    public static void main(String[] args) {
        String input = "Charactercounter";

        Map<Character, Integer> occurrences = input.toLowerCase()
                .chars()
                .boxed()
                .collect(toMap(
                        k -> ((char) k.intValue()),
                        v -> 1,         // 1 occurrence
                        Integer::sum)); // counting

        System.out.println(occurrences);
    }
}