package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    Stream<Supplier<String>> getRules(int number) {
        return Stream.of(fizzRule(number), buzzRule(number));
    }

    private Supplier<String> fizzRule(int number) {
        return () -> {
            if (isDisibleBy(number, 3)) {
                return "Fizz";
            }
            return "";
        };
    }

    private Supplier<String> buzzRule(int number) {
        return () -> {
            if (isDisibleBy(number, 5)) {
                return "Buzz";
            }
            return "";
        };
    }

    private boolean isDisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
