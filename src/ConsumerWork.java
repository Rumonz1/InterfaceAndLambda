import java.util.function.Consumer;

public class ConsumerWork {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Привет, я "+ s);
        consumer.accept("Петя");
    }
}
