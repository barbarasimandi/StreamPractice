public class Excercise5 {
    public static void main(String[] args) {
        String inputString = "wHIcHonEsaeREUppercase?";

        String upperCase = inputString
                .chars()
                .filter(c -> Character.isUpperCase(c))
                .collect(StringBuilder::new,                // supplier
                        StringBuilder::appendCodePoint,     // accumulator
                        StringBuilder::append)              // combiner
                .toString();

        System.out.println(upperCase);


    }
}
