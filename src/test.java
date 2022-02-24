import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test{
    @Test
    public void testgetChoice(){
        //arrange

        choice test = new choice();

        //act

        int actual = test.getChoice();


        //assert

        int expected = 0;

        assertEquals(expected, actual);
    }

    private class choice {
        public int getChoice() {
            return 0;
        }
    }
}