import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Cabelo cabelo = new Cabelo("liso","preto");
        Rosto rosto = new Rosto(cabelo, "fino", "castanho", "grande", "pequena");
        Pessoa pessoa = new Pessoa("Pessoa1", "1,70", "branco", "italiano", rosto);

        Pessoa pessoaClone = pessoa.clone();
        pessoaClone.getRosto().getCabelo().setTipo("ondulado");
        pessoaClone.getRosto().setFormatoNariz("largo");
        pessoaClone.setNome("Pessoa2");

        assertEquals("Pessoa{nome='Pessoa1', altura='1,70', cor='branco', nacionalidade='italiano', Rosto{Cabelo{tipo='liso', cor='preto'}, formatoNariz='fino', corOlhos='castanho', formatoBoca='grande', formatoOrelha='pequena'}, cloneCount=1}",pessoa.toString());
        assertEquals("Pessoa{nome='Pessoa2', altura='1,70', cor='branco', nacionalidade='italiano', Rosto{Cabelo{tipo='ondulado', cor='preto'}, formatoNariz='largo', corOlhos='castanho', formatoBoca='grande', formatoOrelha='pequena'}, cloneCount=0}",pessoaClone.toString());
    }

}