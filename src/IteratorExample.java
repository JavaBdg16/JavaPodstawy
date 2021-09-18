import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class IteratorExample {

    public static void main(String[] args) {

        Iterator<String> strings = Arrays.asList("a", "b", "c", "d").iterator();
        while (strings.hasNext()) {
            System.out.println(strings.next());
        }

        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.get(0);

        Stack<String> stack = new Stack<>();
        stack.
    }
}
