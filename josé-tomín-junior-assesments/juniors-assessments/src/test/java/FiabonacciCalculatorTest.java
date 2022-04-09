import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * NO CAMBIAR O SERA DESCALIFICADO
 */
class FiabonacciCalculatorTest {

    private FiabonacciCalculator subject;

    @BeforeEach
    void setUp() {
        subject=new FiabonacciCalculator();
    }

    @Test
    void test1() {
        Assertions.assertEquals(subject.calculateSerie(10),55);
    }

    @Test
    void test2() {
        Assertions.assertEquals(subject.calculateSerie(30),832040);
    }


}