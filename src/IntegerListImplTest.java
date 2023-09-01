import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    private final IntegerListImpl integerList = new IntegerListImpl();

    @Test
    void add() {
        Integer actual = integerList.add(1);
        Integer expected = 1;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void testAdd() {
        Integer actual = integerList.add(0,2);
        Integer expected = 2;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void set() {
        Integer actual = integerList.set(0,3);
        Integer expected = 3;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void remove() {
        integerList.add(4);
        Integer actual = integerList.removeInteger(4);
        Integer expected = 45;
        Assertions.assertEquals(actual,expected);
    }


    @Test
    void testRemove() {
        integerList.add(5);
        Integer actual = integerList.remove(0);
        Integer expected = 5;
        Assertions.assertEquals(actual,expected);
    }


}