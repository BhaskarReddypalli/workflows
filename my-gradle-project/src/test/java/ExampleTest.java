import org.junit.jupiter.api.Test;  
import static org.junit.jupiter.api.Assertions.assertEquals;

class Example{
    @Test
    void sampleTest() {
        Hello hello = new Hello();
        assertEquals(5, hello.add(2, 3));
    }
   

}