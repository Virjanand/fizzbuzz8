package fizzbuzz;

import java.util.function.Function;
import java.util.stream.Stream;

public class FizzBuzzRules {
    Stream<Function<Integer, String>> getRules() {
        return Stream.of(fizzRule(), buzzRule());
    }

    private Function<Integer, String> fizzRule() {
        return number -> isDisibleBy(number, 3) ? "Fizz" : "";
    }

    private Function<Integer, String> buzzRule() {
        return number -> isDisibleBy(number, 5) ? "Buzz" : "";
    }

    private boolean isDisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
