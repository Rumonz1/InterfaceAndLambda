import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        Predicate<Integer> condition = q -> q >= 0;
        Function<Integer, String> ifTrue = s -> "Положительное число";
        Function<Integer, String> ifFalse = s -> "Отрицательное число";
        Function<Integer, String> function = ternaryOperator(condition, ifTrue, ifFalse) ;
        System.out.println(function.apply(-1));
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);

    }
}
