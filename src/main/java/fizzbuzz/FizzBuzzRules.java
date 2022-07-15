package fizzbuzz;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FizzBuzzRules {
    Stream<Supplier<String>> getRules(int number) {
        return Stream.of(fizzRule(number), buzzRule(number));
    }

    private Supplier<String> fizzRule(int number) {
        return () -> isDisibleBy(number, 3) ? "Fizz" : "";
    }

    private Supplier<String> buzzRule(int number) {
        return () -> isDisibleBy(number, 5) ? "Buzz" : "";
    }

    private boolean isDisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
