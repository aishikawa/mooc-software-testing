package tudelft.caesarshift;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void positiveShift() {
        CaesarShiftCipher csh = new CaesarShiftCipher();
        Assertions.assertEquals("def", csh.CaesarShiftCipher("abc", 3));
    }

    @Test
    public void negativeShift() {
        CaesarShiftCipher csh = new CaesarShiftCipher();
        Assertions.assertEquals("xyz", csh.CaesarShiftCipher("abc", -3));
    }

    @Test
    public void invalidMessage() {
        CaesarShiftCipher csh = new CaesarShiftCipher();
        Assertions.assertEquals("invalid", csh.CaesarShiftCipher("Abc", 1));
    }

    @Test
    public void messageWithSpace() {
        CaesarShiftCipher csh = new CaesarShiftCipher();
        Assertions.assertEquals("bcd yza", csh.CaesarShiftCipher("abc xyz", 1));
    }

}
