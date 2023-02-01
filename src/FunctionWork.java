import java.util.function.Function;

public class FunctionWork {
    public static void main(String[] args) {
        Function<Double , Long> function = a -> Math.round(a);
        System.out.println(function.apply(4.678));
        System.out.println(function.apply(293.111111));
        System.out.println(function.apply(5.99));
    }
}
