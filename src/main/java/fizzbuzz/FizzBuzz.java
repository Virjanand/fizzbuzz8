package fizzbuzz;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    private final FizzBuzzRules rules;

    public FizzBuzz(FizzBuzzRules rules) {
        this.rules = rules;
    }

    public List<String> getNumbers(int from, int until) {
        return IntStream.rangeClosed(from, until).mapToObj(number -> toFizzBuzz(number, rules.getRules())).collect(Collectors.toList());
    }

    private String toFizzBuzz(int number, Stream<Function<Integer, String>> rules) {
        String result = rules.map(rule -> rule.apply(number)).collect(Collectors.joining());
        if (result.isEmpty()) {
            return Integer.toString(number);
        }
        return result;
    }
}
