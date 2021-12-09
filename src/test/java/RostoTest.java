import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RostoTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Cabelo cabelo = new Cabelo("liso", "ruivo");
        Rosto rosto1 = new Rosto(cabelo, "liso", "castanho", "pequena", "pequena");
        Rosto rosto2 = rosto1.clone();

        rosto2.setFormatoNariz("achatado");
        rosto2.setCorOlhos("azul");

        assertEquals("Rosto{Cabelo{tipo='liso', cor='ruivo'}, formatoNariz='liso', corOlhos='castanho', formatoBoca='pequena', formatoOrelha='pequena'}", rosto1.toString());
        assertEquals("Rosto{Cabelo{tipo='liso', cor='ruivo'}, formatoNariz='achatado', corOlhos='azul', formatoBoca='pequena', formatoOrelha='pequena'}", rosto2.toString());
    }
}