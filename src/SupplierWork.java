import java.util.function.Supplier;

public class SupplierWork {
    public static void main(String[] args) {
        Supplier<Integer> supplier =() -> (int) (Math.random()* 100);
        System.out.println(supplier.get());
    }
}
