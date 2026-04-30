package StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Capitalize {

    static void main() {
        List<String> names = List.of("Alice", "Bob","Aston", "Charlie");

        List<String> result = names.stream()
                .filter(name->name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
