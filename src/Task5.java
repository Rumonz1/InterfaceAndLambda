import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        Integer i = 10;
        Predicate<Object> condition = q -> i >= 0;
        Function<Object, String> ifTrue = s -> "Положительное число";
        Function<Object, String> ifFalse = s -> "Отрицательное число";
        Function<Object, String> function = ternaryOperator(condition, ifTrue, ifFalse) ;
        System.out.println(function.apply(0));
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);

    }
}
