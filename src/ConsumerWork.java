import java.util.function.Consumer;

public class ConsumerWork {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет, я "+ s);
            }
        };
        consumer.accept("Петя");
        consumer.accept("Леонид");
        consumer.accept("Абобус");
    }
}
