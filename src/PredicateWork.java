import java.util.function.Predicate;

public class PredicateWork {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i >= 0;
        System.out.println( predicate.test(5));
        System.out.println( predicate.test(-10));
        System.out.println( predicate.test(0));
    }
}
