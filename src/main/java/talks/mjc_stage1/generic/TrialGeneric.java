package talks.mjc_stage1.generic;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertEquals;

public class TrialGeneric {
    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        TrialGeneric Generics = null;
        List<String> stringList
                = Generics.fromArrayToList(intArray, Object::toString);
        System.out.println(stringList);
//        assertThat(stringList, hasItems("1", "2", "3", "4", "5"));
    }

    @Test
    public void whenUsedWithinCollectors_thenJoined() {
        List<String> rgbList = Arrays.asList("Red", "Green", "Blue");
        String commaSeparatedRGB = rgbList.stream()
                .map(color -> color.toString())
                .collect(Collectors.joining(","));
        assertEquals(commaSeparatedRGB, "Red,Green,Blue");
    }


}
