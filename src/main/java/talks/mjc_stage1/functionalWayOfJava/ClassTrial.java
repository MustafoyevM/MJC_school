package talks.mjc_stage1.functionalWayOfJava;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class ClassTrial extends Throwable    implements Trial {
    public static void main(String[] args) {
        Function<String, String> re = str -> str.toLowerCase();
        Consumer<Integer> numref = num -> System.out.println(num);
        Runnable runnable = System.out::println;
        Function<String, Integer> function = (d) -> new Integer(d);
        System.out.println(function.apply("4"));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        min.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );
        if(min.isPresent()){
            System.out.println(min.get());
        }
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.isEmpty());
    }
}
