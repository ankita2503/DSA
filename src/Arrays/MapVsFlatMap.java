package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] str) {

        List <List<String>> Names = Arrays.asList(Arrays.asList("Rose", "Mona"), Arrays.asList("Mike", "Billy"),
                Arrays.asList("Mia", "Monica"), Arrays.asList("Taylor", "John"));
        List<String> Start = Names.stream().flatMap(FirstName -> FirstName.stream()).filter(s->s.startsWith("M")).collect(Collectors.toList());
        Start.forEach(System.out::println);
    }
}
