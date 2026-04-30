package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9,5,6,7,2);

        nums.stream()
                .filter(n->n%2 ==1)
                .sorted()
                .map(n->n*2)
                .forEach(n-> System.out.println(n));

//        Stream<Integer> data = nums.stream();
//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n-> System.out.println(n));

//        Stream<Integer> mappedData = data.map(n->n*2);
//        mappedData.forEach(n-> System.out.println(n));
    }
}
