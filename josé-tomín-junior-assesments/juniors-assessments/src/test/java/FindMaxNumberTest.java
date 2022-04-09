import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

/**
 * NO CAMBIAR O SERA DESCALIFICADO
 */
class FindMaxNumberTest {

    private FindMaxNumber subject;

    @BeforeEach
    void setUp() {
        subject = new FindMaxNumber();
    }

    void test1() {
        Assertions.assertEquals(subject.getMax(new int[]{1, 2, 4, 3, 5}), 5);
    }

    void test2() {
        Assertions.assertEquals(subject.getMax(new int[]{1, 2, 4, 3, 5}), 5);
    }

}