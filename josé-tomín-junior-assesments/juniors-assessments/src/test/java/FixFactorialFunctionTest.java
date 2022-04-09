import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * NO CAMBIAR O SERA DESCALIFICADO
 */
class FixFactorialFunctionTest {

    private FixFactorialFunction subject;

    @BeforeEach
    void setUp() {
        subject = new FixFactorialFunction();
    }

    @Test
    public void test1() {
        Assertions.assertEquals(24, subject.factorial(4));
    }


    @Test
    public void test2() {
        Assertions.assertEquals(3628800, subject.factorial(10));
    }
}