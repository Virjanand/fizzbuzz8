package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    Stream<Supplier<String>> getRules(int number) {
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
}
