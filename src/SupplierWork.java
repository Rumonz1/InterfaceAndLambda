import java.util.function.Supplier;

public class SupplierWork {
    public static void main(String[] args) {
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random()* 100);
            }
        };
        System.out.println(supplier.get());
    }
}
