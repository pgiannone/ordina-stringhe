import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {
    @Test
    public void test1() {
        Assertions.assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
    }
}