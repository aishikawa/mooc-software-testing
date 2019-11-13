package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void happy() {
        GHappy gHappy = new GHappy();
        Assertions.assertTrue(gHappy.gHappy("abcggabc"));
    }

    @Test
    public void unhappy() {
        GHappy gHappy = new GHappy();
        Assertions.assertFalse(gHappy.gHappy("abcdefghij"));
    }

    @Test
    public void notAllGHappy() {
        GHappy gHappy = new GHappy();
        Assertions.assertFalse(gHappy.gHappy("xxggyygx"));
    }

    @Test
    public void tripleG() {
        GHappy gHappy = new GHappy();
        Assertions.assertTrue(gHappy.gHappy("xxgggx"));
    }

    @Test
    public void empty() {
        GHappy gHappy = new GHappy();
        Assertions.assertTrue(gHappy.gHappy(""));
    }

    @Test
    public void firstG() {
        GHappy gHappy = new GHappy();
        Assertions.assertTrue(gHappy.gHappy("ggxxx"));
    }

    @Test
    public void lastG() {
        GHappy gHappy = new GHappy();
        Assertions.assertTrue(gHappy.gHappy("xxxgg"));
    }

}
