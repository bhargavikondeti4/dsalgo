import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.forEach(System.out::println);

    }
}
