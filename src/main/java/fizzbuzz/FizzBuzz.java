package fizzbuzz;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
    public List<String> getNumbers(int from, int until) {
        return IntStream.rangeClosed(from, until).mapToObj(number -> toFizzBuzz(number, getRules(number))).collect(Collectors.toList());
    }

    private Stream<Supplier<String>> getRules(int number) {
        return Stream.of(fizzRule(number), buzzRule(number));
    }

    private Supplier<String> fizzRule(int number) {
        return () -> {
            if (number % 3 == 0) {
                return "Fizz";
            }
            return "";
        };
    }

    private Supplier<String> buzzRule(int number) {
        return () -> {
            if (number % 5 == 0) {
                return "Buzz";
            }
            return "";
        };
    }

    private String toFizzBuzz(int number, Stream<Supplier<String>> rules) {
        String result = rules.map(Supplier::get).collect(Collectors.joining());
        if (result.isEmpty()) {
            return Integer.toString(number);
        }
        return result;
    }
}
