import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabeloTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Cabelo cabelo1 = new Cabelo("cacheado", "loiro");
        Cabelo cabelo2 = cabelo1.clone();

        cabelo2.setTipo("liso");

        assertEquals("Cabelo{tipo='cacheado', cor='loiro'}", cabelo1.toString());
        assertEquals("Cabelo{tipo='liso', cor='loiro'}", cabelo2.toString());
    }

}