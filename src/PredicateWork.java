import java.util.function.Predicate;

public class PredicateWork {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0;
            }
        };
        System.out.println(predicate.test(3));
        System.out.println(predicate.test(0));
        System.out.println(predicate.test(-20));
    }
}
