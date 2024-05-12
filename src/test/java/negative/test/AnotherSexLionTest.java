package negative.test;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AnotherSexLionTest {

    @Mock
    Feline feline;

    @Test
    public void testExceptionInLionConstructor() {
        Exception lionException = assertThrows(Exception.class, () -> new Lion(" ", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", lionException.getMessage());
    }
}
